/*
Archivo: Gato.java
Descripcion: 
    Clase que representa un gato, hereda de la clase Animal.
    Aqui colocamos lo que es especifico de los gatos.


*/

public class Gato extends Animal{
    // Constructor de Gato 
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }


    // Sobrescribimos el metodo hacerSonido()
    @Override
    public void hacerSonido(){
        System.out.println("Miau miau!");
    }

}
