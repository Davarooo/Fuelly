const offersPerPage = 6;
let currentPage = 1;
let filteredOffers = offers;

function truncateText(text, maxLength) {
  return text.length > maxLength ? text.substring(0, maxLength) + "..." : text;
}

function renderOffers() {
  const offersGrid = document.getElementById("offers-grid");
  offersGrid.innerHTML = "";
  const start = (currentPage - 1) * offersPerPage;
  const end = start + offersPerPage;
  const paginatedOffers = filteredOffers.slice(start, end);

  paginatedOffers.forEach((offer) => {
    const today = new Date();
    const validityDate = offer.validity;
    const timeDiff = validityDate.getTime() - today.getTime();
    const daysDiff = Math.ceil(timeDiff / (1000 * 3600 * 24));
    let validityClass = "";
    if (daysDiff <= 2) {
      validityClass = "badge badge-danger";
    } else if (daysDiff <= 7) {
      validityClass = "badge badge-warning";
    } else {
      validityClass = "badge badge-success";
    }
    const offerCard = document.createElement("div");
    offerCard.className = "col-md-4 mb-4";
    offerCard.innerHTML = `
    <div class="card offer-card">
        <div class="card-header">${offer.stationName}</div>
        <img src="${offer.logo}" class="card-img-top" alt="Logo de ${
      offer.stationName
    }">
        <div class="card-body">
            <h6 class="card-subtitle mb-2 text-muted">${offer.fuelType}</h6>
            <p class="card-text conditions">${truncateText(
              offer.conditions,
              400
            )}</p>
            <p class="card-text"><small class="text-muted">Disponible hasta: <span class="${validityClass} validity-text">${offer.validity.toLocaleDateString(
      "es-ES",
      { day: "numeric", month: "long", year: "numeric" }
    )}</span></small></p>
            <div class="btn-container">
                <a href="detalle-oferta.html?offer=${offers.indexOf(
                  offer
                )}" class="btn btn-primary stretched-link">Ver detalles</a>
            </div>
        </div>
    </div>
`;
    offersGrid.appendChild(offerCard);
  });
}

function renderPagination() {
  const pagination = document.getElementById("pagination");
  pagination.innerHTML = "";
  const pageCount = Math.ceil(filteredOffers.length / offersPerPage);

  const prevPageItem = document.createElement("li");
  prevPageItem.className = `page-item ${currentPage === 1 ? "disabled" : ""}`;
  prevPageItem.innerHTML = `
        <a class="page-link" href="#" aria-label="Anterior" onclick="changePage(${
          currentPage - 1
        })">
            <span aria-hidden="true">&laquo;</span>
        </a>
    `;
  pagination.appendChild(prevPageItem);

  for (let i = 1; i <= pageCount; i++) {
    const pageItem = document.createElement("li");
    pageItem.className = `page-item ${i === currentPage ? "active" : ""}`;
    pageItem.innerHTML = `
            <a class="page-link" href="#" onclick="changePage(${i})">${i}</a>
        `;
    pagination.appendChild(pageItem);
  }

  const nextPageItem = document.createElement("li");
  nextPageItem.className = `page-item ${
    currentPage === pageCount ? "disabled" : ""
  }`;
  nextPageItem.innerHTML = `
        <a class="page-link" href="#" aria-label="Siguiente" onclick="changePage(${
          currentPage + 1
        })">
            <span aria-hidden="true">&raquo;</span>
        </a>
    `;
  pagination.appendChild(nextPageItem);
}

function changePage(page) {
  if (page < 1 || page > Math.ceil(filteredOffers.length / offersPerPage))
    return;
  currentPage = page;
  renderOffers();
  renderPagination();
}

function filterOffers() {
  const stationFilter = document.getElementById("station-filter").value;
  const fuelFilter = document.getElementById("fuel-filter").value;

  filteredOffers = offers.filter((offer) => {
    return (
      (stationFilter === "" || offer.stationName === stationFilter) &&
      (fuelFilter === "" || offer.fuelType === fuelFilter)
    );
  });

  currentPage = 1;
  renderOffers();
  renderPagination();
}

document.addEventListener("DOMContentLoaded", () => {
  const stationFilter = document.getElementById("station-filter");
  const fuelFilter = document.getElementById("fuel-filter");

  const uniqueStations = [...new Set(offers.map((offer) => offer.stationName))];
  uniqueStations.forEach((station) => {
    const option = document.createElement("option");
    option.value = station;
    option.textContent = station;
    stationFilter.appendChild(option);
  });

  const uniqueFuelTypes = [...new Set(offers.map((offer) => offer.fuelType))];
  uniqueFuelTypes.forEach((fuel) => {
    const option = document.createElement("option");
    option.value = fuel;
    option.textContent = fuel;
    fuelFilter.appendChild(option);
  });

  stationFilter.addEventListener("change", filterOffers);
  fuelFilter.addEventListener("change", filterOffers);

  renderOffers();
  renderPagination();
});
