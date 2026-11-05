import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Personaje> personajes = new ArrayList<>();

        try {

            // REGISTRAR GUERRERO

            System.out.println("=== REGISTRO DEL GUERRERO ===");

            System.out.print("Ingrese ID: ");
            int idGuerrero = Integer.parseInt(sc.nextLine());

            System.out.print("Ingrese nombre: ");
            String nombreGuerrero = sc.nextLine();

            System.out.print("Ingrese nivel: ");
            int nivelGuerrero = Integer.parseInt(sc.nextLine());

            if (idGuerrero <= 0) {
                System.out.println("Error: El ID debe ser mayor que 0.");
                return;
            }

            if (nombreGuerrero.trim().isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacio.");
                return;
            }

            if (nivelGuerrero < 1 || nivelGuerrero > 100) {
                System.out.println("Error: El nivel debe estar entre 1 y 100.");
                return;
            }

            Guerrero guerrero = new Guerrero(
                idGuerrero, nombreGuerrero, nivelGuerrero
            );

            personajes.add(guerrero);

            // REGISTRAR MAGO

            System.out.println("\n=== REGISTRO DEL MAGO ===");

            System.out.print("Ingrese ID: ");
            int idMago = Integer.parseInt(sc.nextLine());

            System.out.print("Ingrese nombre: ");
            String nombreMago = sc.nextLine();

            System.out.print("Ingrese nivel: ");
            int nivelMago = Integer.parseInt(sc.nextLine());

            if (idMago <= 0) {
                System.out.println("Error: El ID debe ser mayor que 0.");
                return;
            }

            if (nombreMago.trim().isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacio.");
                return;
            }

            if (nivelMago < 1 || nivelMago > 100) {
                System.out.println("Error: El nivel debe estar entre 1 y 100.");
                return;
            }

            Mago mago = new Mago(
                idMago, nombreMago, nivelMago
            );

            personajes.add(mago);

            // MOSTRAR PERSONAJES

            System.out.println("\n=== LISTA DE PERSONAJES ===");

            for (Personaje personaje : personajes) {

                personaje.mostrarInfo();

                System.out.println("Accion: "
                    + personaje.realizarAccion());

                System.out.println("----------------------");
            }

        } catch (NumberFormatException e) {

            System.out.println(
                "Error: Debe ingresar un numero valido. Programa finalizado."
            );

        }

        sc.close();
    }
}