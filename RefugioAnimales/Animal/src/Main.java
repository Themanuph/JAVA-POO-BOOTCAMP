import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Refugio refugio = new Refugio();

        int opcion = 0;

        do {

            System.out.println("\n=========== REFUGIO ===========");
            System.out.println("1. Registrar animal");
            System.out.println("2. Mostrar animales");
            System.out.println("3. Buscar animal por ID");
            System.out.println("4. Adoptar animal");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            try {

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:

                        try {

                            System.out.println("\n1. Perro");
                            System.out.println("2. Gato");
                            System.out.print("Seleccione el tipo: ");

                            int tipo = Integer.parseInt(sc.nextLine());

                            if (tipo != 1 && tipo != 2) {
                                System.out.println("Tipo de animal invalido.");
                                break;
                            }

                            System.out.print("Ingrese ID: ");
                            int id = Integer.parseInt(sc.nextLine());

                            System.out.print("Ingrese nombre: ");
                            String nombre = sc.nextLine();

                            System.out.print("Ingrese edad: ");
                            int edad = Integer.parseInt(sc.nextLine());

                            Animal animal;

                            if (tipo == 1) {

                                System.out.print("Ingrese raza: ");
                                String raza = sc.nextLine();

                                animal = new Perro(id, nombre, edad, raza);

                            } else {

                                System.out.print("Ingrese color: ");
                                String color = sc.nextLine();

                                animal = new Gato(id, nombre, edad, color);
                            }

                            if (refugio.registrarAnimal(animal)) {

                                System.out.println("Animal registrado correctamente.");

                            } else {

                                System.out.println("Error: El ID ya existe.");
                            }

                        } catch (NumberFormatException e) {

                            System.out.println("Error: Debe ingresar un numero valido.");

                        } catch (IllegalArgumentException e) {

                            System.out.println("Error: " + e.getMessage());
                        }

                        break;

                    case 2:

                        refugio.mostrarAnimales();

                        break;

                    case 3:

                        if (refugio.estaVacio()) {

                            System.out.println("No hay animales registrados.");

                            break;
                        }

                        System.out.print("Ingrese el ID que desea buscar: ");

                        try {

                            int idBuscar = Integer.parseInt(sc.nextLine());

                            Animal encontrado = refugio.buscarPorId(idBuscar);

                            if (encontrado != null) {

                                encontrado.mostrarInformacion();

                                System.out.println("Accion: "
                                    + encontrado.realizarAccion());

                            } else {

                                System.out.println("Animal no encontrado.");
                            }

                        } catch (NumberFormatException e) {

                            System.out.println("Error: Ingrese un ID numerico.");
                        }

                        break;

                    case 4:

                        if (refugio.estaVacio()) {

                            System.out.println("No hay animales para adoptar.");

                            break;
                        }

                        System.out.print("Ingrese el ID del animal: ");

                        try {

                            int idAdoptar = Integer.parseInt(sc.nextLine());

                            Animal animal = refugio.buscarPorId(idAdoptar);

                            if (animal == null) {

                                System.out.println("Animal no encontrado.");

                            } else if (animal.getEstado().equals("ADOPTADO")) {

                                System.out.println("Este animal ya fue adoptado.");

                            } else {

                                refugio.adoptarAnimal(idAdoptar);

                                System.out.println("Animal adoptado correctamente.");
                            }

                        } catch (NumberFormatException e) {

                            System.out.println("Error: Ingrese un ID numerico.");
                        }

                        break;

                    case 5:

                        System.out.println("Gracias por utilizar el sistema.");

                        break;

                    default:

                        System.out.println("Opcion invalida. Seleccione entre 1 y 5.");

                }

            } catch (NumberFormatException e) {

                System.out.println("Error: Debe ingresar un numero.");

            }

        } while (opcion != 5);

        sc.close();
    }
}