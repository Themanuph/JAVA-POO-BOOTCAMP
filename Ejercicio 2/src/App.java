/*
Titulo: Ejercicio 2 - Constructor y metodos 
Autor: Gabriel Jose Garcia
Enunciado: 
    Crear una clase llamada Producto con los atributos nombre, precio y stock.
    La clase debe tener un constructor, un metodo para mostrar informacion y 
    un metodo para calcular el valor total del inventario.

*/


public class App {
    public static void main(String[] args) throws Exception {
        
        Producto producto1 = new Producto("Mouse", 10, 15.50);

        Producto producto2 = new Producto("Teclado", 5, 20.00);

        System.out.println("====PRODUCTO 1====");

        producto1.mostrarInfo(); // Llamamos al metodo mostrarInfo del primer objeto
        System.out.println("Valor total en inventario: " + producto1.calcularValorInventario());

        System.out.println();

        System.out.println("====PRODUCTO 2====");
        producto2.mostrarInfo(); // Llamamos al metodo mostrarInfo del segundo objeto
        System.out.println("Valor total en inventario: " + producto2.calcularValorInventario());

    }

}