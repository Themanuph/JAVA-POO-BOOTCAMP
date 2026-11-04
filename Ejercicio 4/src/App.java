/*
PROBLEMA 1 - SISTEMA SIMPLE DE ANIMALES DE REFUGIO 
Autor: Jhonatan Torres
Fecha: 28 de Octubre 2026

Enunciado: Desarrollar un programa en Java que permita representar animales 
    dentro de un refugio. 
    El sistema debe contar con:
        - una clase base llamada Animal.
        - dos subclases llamadas Perro y Gato. 
        - un metodo llamado hacerSonido() que se comporte de manera distinta 
        en cada subclase. 
        - una coleccion que almacene varios animales
        - un recorrido que muestre informacion y el sonido de cad animal.
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Creamos una lista de tipo Animal
        // Esto es imporattne porque aqui podremos guardar objetos
        // Perro y Gato gracias a la herencia.
        ArrayList<Animal> animales = new ArrayList<>();

        // agregamos objetos de distintas subclases

        animales.add(new Perro("Firulais", 3));
        animales.add(new Gato("Misu", 2));
        animales.add(new Perro("Rocky", 5));

        // Recorremos la lista
        for (Animal animal : animales) {
            animal.mostrarInfo();
            animal.hacerSonido();
            System.out.println("---------------------------------");

        }
    }
}
