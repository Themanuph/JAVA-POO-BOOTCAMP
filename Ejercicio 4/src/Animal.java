/*
Archivo: Animal.java
Descripcion: 
    Clase padre que representa un animal genral. 
    Aqui colocamos lo que todos los animales tienen en comun.
*/

public class Animal {
    // Atributos comnunes par todos los animales
    private String nombre;
    private int edad;

    // Constructor de la clase Animal
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo para mostrar informacion basica
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
