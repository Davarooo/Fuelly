import java.util.Scanner;
public class Fuelly {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.println("Bienvenido a Fuelly");

        System.out.println("Por favor, ingresa tu nombre: ");
        String nombre = dato.next();

        System.out.println("Ingresa el tipo de usuario que eres:\n"+
                        "- Administrador \n"+
                        "- Cliente/usuario \n"+
                        "- Empresa");
        String tipoUsuario = dato.next();

        System.out.println("Ingresa tu número de documento: ");
        String documento = dato.next();

        System.out.println("Ingresa el número de la calle donde te encuentras: ");
        int calle = dato.nextInt();

        System.out.println("Ingresa el número del barrio donde te encuentras:\n "+
                         "1.Poblado \n"+
                         "2.Laureles \n"+
                         "3. Belén \n"+
                         "4. Manrique  \n"+
                         "5. Envigado  \n" +
                         "6. Sabaneta  \n" +
                         "7. Robledo  \n"+
                         "8. Buenos Aires  \n"+
                         "9. Cartilla  \n"+
                         "10. San Javier");
        int barrio = dato.nextInt();

        System.out.println("¿Qué tipo de combustible necesitas?(escriba una de las opciones que salen a continuación)\n"+
                        "- Gasolina \n"+ 
                        "- Diesel \n"+
                        "- Gas natural \n" +
                        "- Queroseno  \n" +
                        "- Biocombustibles \n" +
                        "- Carga eléctrica");
        String combustible = dato.next();

        System.out.println("¿Prefieres precios más económicos o más costosos? (económico / costoso): ");
        String precio = dato.next();

        System.out.println("Los resultados de la búsqueda basándonos en la información suministrada son los siguientes:");
        System.out.println("Usted "+nombre+" se encuentra en la calle "+calle+", teniendo en cuenta su ubicación y el punto de referencia '"+barrio+"', Fuelly ha determinado que:");

        switch (barrio) {
            case 1:
                if (precio.equals("económico")) {
                    if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                        System.out.println("El punto más cercano para obtener combustible es TurboExpress.");
                    } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                        System.out.println("El punto más cercano para obtener combustible es NaturalStation.");
                    } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                        System.out.println("El punto más cercano para obtener combustible es GreenPlanet");
                    } else {
                        System.out.println("Combustible no disponible en el momento");
                    }
                } else if (precio.equals("costoso")) {
                    if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                        System.out.println("El punto más cercano para obtener combustible es VIPcars.");
                    } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                        System.out.println("El punto más cercano para obtener combustible es GoldPlace.");
                    } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                        System.out.println("El punto más cercano para obtener combustible es NewParadise");
                    } else {
                        System.out.println("Combustible no disponible en el momento");
                    }
                } else {
                    System.out.println("Opción de precio no válida");
                }
                    break;
            case 2:
            if (precio.equals("económico")) {
                if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                    System.out.println("El punto más cercano para obtener combustible es Terpel.");
                } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                    System.out.println("El punto más cercano para obtener combustible es Texaco.");
                } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                    System.out.println("El punto más cercano para obtener combustible es PetroStation");
                } else {
                    System.out.println("Combustible no disponible en el momento");
                }
            } else if (precio.equals("costoso")) {
                if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                    System.out.println("El punto más cercano para obtener combustible es OilGulf.");
                } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                    System.out.println("El punto más cercano para obtener combustible es ShellGas.");
                } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                    System.out.println("El punto más cercano para obtener combustible es PumaEnergy");
                } else {
                    System.out.println("Combustible no disponible en el momento");
                }
            } else {
                System.out.println("Opción de precio no válida");
            }
                break;
            case 3:
                if (precio.equals("económico")) {
                    if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                        System.out.println("El punto más cercano para obtener combustible es ExxonMobil.");
                    } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                        System.out.println("El punto más cercano para obtener combustible es BPGas.");
                    } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                        System.out.println("El punto más cercano para obtener combustible es RepsonFuel");
                    } else {
                        System.out.println("Combustible no disponible en el momento");
                    }
                } else if (precio.equals("costoso")) {
                    if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                        System.out.println("El punto más cercano para obtener combustible es SinclairOil.");
                    } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                        System.out.println("El punto más cercano para obtener combustible es ArcoGas.");
                    } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                        System.out.println("El punto más cercano para obtener combustible es EnigmaStation");
                    } else {
                        System.out.println("Combustible no disponible en el momento");
                    }
                } else {
                    System.out.println("Opción de precio no válida");
                }
                break;
            case 4:
            if (precio.equals("económico")) {
                if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                    System.out.println("El punto más cercano para obtener combustible es MurphyColom.");
                } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                    System.out.println("El punto más cercano para obtener combustible es Texaco.");
                } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                    System.out.println("El punto más cercano para obtener combustible es PilotFuel");
                } else {
                    System.out.println("Combustible no disponible en el momento");
                }
            } else if (precio.equals("costoso")) {
                if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                    System.out.println("El punto más cercano para obtener combustible es OilGulf.");
                } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                    System.out.println("El punto más cercano para obtener combustible es ShellGas.");
                } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                    System.out.println("El punto más cercano para obtener combustible es PumaEnergy");
                } else {
                    System.out.println("Combustible no disponible en el momento");
                }
            } else {
                System.out.println("Opción de precio no válida");
            }
                break;
            case 5:
                if (precio.equals("económico")) {
                    if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                        System.out.println("El punto más cercano para obtener combustible es CopOil.");
                    } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                        System.out.println("El punto más cercano para obtener combustible es HolidayStation.");
                    } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                        System.out.println("El punto más cercano para obtener combustible es OnCueExpress");
                    } else {
                        System.out.println("Combustible no disponible en el momento");
                    }
                } else if (precio.equals("costoso")) {
                    if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                        System.out.println("El punto más cercano para obtener combustible es KwikStation.");
                    } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                        System.out.println("El punto más cercano para obtener combustible es Kum&KoGas.");
                    } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                        System.out.println("El punto más cercano para obtener combustible es RaceTrack");
                    } else {
                        System.out.println("Combustible no disponible en el momento");
                    }
                } else {
                    System.out.println("Opción de precio no válida");
                }
                    break;
            case 6:
            if (precio.equals("económico")) {
                if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                    System.out.println("El punto más cercano para obtener combustible es Buc-ess.");
                } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                    System.out.println("El punto más cercano para obtener combustible es Casey'sGas.");
                } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                    System.out.println("El punto más cercano para obtener combustible es DocStation");
                } else {
                    System.out.println("Combustible no disponible en el momento");
                }
            } else if (precio.equals("costoso")) {
                if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                    System.out.println("El punto más cercano para obtener combustible es CircleOil.");
                } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                    System.out.println("El punto más cercano para obtener combustible es WaWaGas.");
                } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                    System.out.println("El punto más cercano para obtener combustible es ValeroFuel");
                } else {
                    System.out.println("Combustible no disponible en el momento");
                }
            } else {
                System.out.println("Opción de precio no válida");
            }
                break;
            case 7:
                if (precio.equals("económico")) {
                    if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                        System.out.println("El punto más cercano para obtener combustible es ChevronFuel.");
                    } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                        System.out.println("El punto más cercano para obtener combustible es LukoilGas.");
                    } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                        System.out.println("El punto más cercano para obtener combustible es FamilyExpress");
                    } else {
                        System.out.println("Combustible no disponible en el momento");
                    }
                } else if (precio.equals("costoso")) {
                    if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                        System.out.println("El punto más cercano para obtener combustible es GetGoFuel.");
                    } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                        System.out.println("El punto más cercano para obtener combustible es QuikTripGas.");
                    } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                        System.out.println("El punto más cercano para obtener combustible es ElevenPoint");
                    } else {
                        System.out.println("Combustible no disponible en el momento");
                    }
                } else {
                    System.out.println("Opción de precio no válida");
                }
                break;
            case 8:
            if (precio.equals("económico")) {
                if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                    System.out.println("El punto más cercano para obtener combustible es SunWay.");
                } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                    System.out.println("El punto más cercano para obtener combustible es CheapGas.");
                } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                    System.out.println("El punto más cercano para obtener combustible es EasyCar");
                } else {
                    System.out.println("Combustible no disponible en el momento");
                }
            } else if (precio.equals("costoso")) {
                if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                    System.out.println("El punto más cercano para obtener combustible es FastCar.");
                } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                    System.out.println("El punto más cercano para obtener combustible es FirstOption.");
                } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                    System.out.println("El punto más cercano para obtener combustible es HealtWorld");
                } else {
                    System.out.println("Combustible no disponible en el momento");
                }
            } else {
                System.out.println("Opción de precio no válida");
            }
                break;
            case 9:
                if (precio.equals("económico")) {
                    if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                        System.out.println("El punto más cercano para obtener combustible es EcoStation.");
                    } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                        System.out.println("El punto más cercano para obtener combustible es NatuGas.");
                    } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                        System.out.println("El punto más cercano para obtener combustible es AutoExpress");
                    } else {
                        System.out.println("Combustible no disponible en el momento");
                    }
                } else if (precio.equals("costoso")) {
                    if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                        System.out.println("El punto más cercano para obtener combustible es GoldenFuel.");
                    } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                        System.out.println("El punto más cercano para obtener combustible es FastFill.");
                    } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                        System.out.println("El punto más cercano para obtener combustible es PioneerWays");
                    } else {
                        System.out.println("Combustible no disponible en el momento");
                    }
                } else {
                    System.out.println("Opción de precio no válida");
                }
                break;
            case 10:
            if (precio.equals("económico")) {
                if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                    System.out.println("El punto más cercano para obtener combustible es PeakFuel.");
                } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                    System.out.println("El punto más cercano para obtener combustible es SmartGas.");
                } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                    System.out.println("El punto más cercano para obtener combustible es RapidRefill");
                } else {
                    System.out.println("Combustible no disponible en el momento");
                }
            } else if (precio.equals("costoso")) {
                if (combustible.equals("Gasolina") || combustible.equals("Diesel")) {
                    System.out.println("El punto más cercano para obtener combustible es FuelTopía.");
                } else if (combustible.equals("Gas natural") || combustible.equals("Carga eléctrica")) {
                    System.out.println("El punto más cercano para obtener combustible es SunPower.");
                } else if (combustible.equals("Queroseno") || combustible.equals("Biocombustibles")) {
                    System.out.println("El punto más cercano para obtener combustible es PrimeFuel");
                } else {
                    System.out.println("Combustible no disponible en el momento");
                }
            } else {
                System.out.println("Opción de precio no válida");
            }
        }


    }
}