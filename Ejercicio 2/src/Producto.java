public class Producto {
    String nombre;
    double stock;
    double precio;

    // Constructor
    public Producto(String nombre, double stock, double precio){
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    // Metodos 
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre); // Mostramos el nombre del producto
        System.out.println("Precio: " + precio); // Mostramos el precio del producto
        System.out.println("Stock: " + stock); // Mostramos el stcok del producto
    }

    public double calcularValorInventario(){
        return precio * stock; // Calculamos el valor total del inventario
    }
}