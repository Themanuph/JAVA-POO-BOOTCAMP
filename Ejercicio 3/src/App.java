/*
Titulo: Ejercicio 3 - Encapsulamiento con validacion
Autor: Gabriel Jose Garcia
Fecha: 26 Octubre 2026
Enunciado: Crear una clase llamaada CuentaBancaria con los atributos privados
    titulos y saldo. 
    La clase debe permitir consultar y modificiar sus datos de forma controlada
    usando getters, setters y metodos con validaciones.
*/

public class App {
    public static void main(String[] args) throws Exception {

        // Creamos una cuenta bancaria coan titular y saldo inicial
        CuentaBancaria cuenta1 = new CuentaBancaria("Jhonatan", 100.0);

        System.out.println("=== DATOS INICIALES ===");
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo: " + cuenta1.getSaldo());

        System.out.println();

        cuenta1.setTitular("Paul"); // Cambiamos el nombre del titular usando el setter

        System.out.println("Nuevo titular: " + cuenta1.getTitular());

        System.out.println();

        cuenta1.depositar(50.0);
        cuenta1.retirar(60.0);
        
        cuenta1.retirar(200.0);

        cuenta1.depositar(-10.0); // Intentamos realizar un deposito invalido

        System.out.println();

        System.out.println("=== DATOS FINALES ===");
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo: " + cuenta1.getSaldo());

    }
}
