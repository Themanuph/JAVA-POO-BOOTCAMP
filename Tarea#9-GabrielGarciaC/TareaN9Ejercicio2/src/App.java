public class App {

    public static void main(String[] args) {

        Telefono telefono1 = new Telefono("Samsung", "A15", 250.0);

        telefono1.mostrarInfo();

        telefono1.setMarca("Apple");
        telefono1.setModelo("iPhone 15");
        telefono1.setPrecio(400.0);

        System.out.println("\nInformacion actualizada:");
        telefono1.mostrarInfo();

        telefono1.setPrecio(-100);

        System.out.println("\nInformacion final:");
        telefono1.mostrarInfo();
    }
}
    