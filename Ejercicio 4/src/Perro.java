/*
Archivo: Perro.java
Descripcion: 
    Clase que representa un perro, hereda de la clase Animal.
    Aqui colocamos lo que es especifico de los perros.

*/
public class Perro extends Animal {
    // Constructor de Perro
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    // Sobreescribimos el metodo hacerSonido()

    @Override
    public void hacerSonido(){
        System.out.println("Guau guau!");

    }

}
