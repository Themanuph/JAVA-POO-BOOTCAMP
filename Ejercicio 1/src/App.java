/*
Titulo del ejercicio: Ejercicio 1 - Clase, objeto y atributos 
Autor: Gabriel Jose Garcia
Enunciado: 
    Cerar una clase llamada Estudiante con los atributos nombre, edad y carrera. 
    Luego, desde la clase principal, crear dos objetos y mostrar sus datos en consola.
*/


public class App {
    public static void main(String[] args) throws Exception {
        Estudiante estudiante1 = new Estudiante();// Aqui creamos el primer objeto de tipo Estudiante

        estudiante1.nombre = "Ana"; // Adignamos el valor "Ana" al atributo nombre del objeto estudiante1
        estudiante1.edad = 22; // Asignamos el valor 22 al atributo edad del objeto estudiante1
        estudiante1.carrera = "Ingenieria de Software"; // Asignamos el valor "Ingenieria de Software" al atributo carrera del objeto estudiante1

        Estudiante estudiante2 = new Estudiante();

        estudiante2.nombre = "Luis"; // Adignamos el valor "Luis" al atributo nombre del objeto estudiante2
        estudiante2.edad = 20; // Asignamos el valor 20 al atributo edad del objeto estudiante2
        estudiante2.carrera = "Ingenieria de Sistemas"; // Asignamos el valor "Ingenieria de Sistemas" al atributo carrera del objeto estudiante2


        System.out.println("===ESTUDIANTE 1===");
        System.out.println("Nombre: " + estudiante1.nombre); //Mostramos el nombre del primer estudiante
        System.out.println("Edad: " + estudiante1.edad);
        System.out.println("Carrera: " + estudiante1.carrera);

        System.out.println("===ESTUDIANTE 2===");
        System.out.println("Nombre: " + estudiante2.nombre); //Mostramos el nombre del segundo estudiante
        System.out.println("Edad: " + estudiante2.edad);
        System.out.println("Carrera: " + estudiante2.carrera);
    }
}