public class Gato extends Animal {

    private String color;

    public Gato(int id, String nombre, int edad, String color) {
        super(id, nombre, edad);

        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("El color no puede estar vacio.");
        }

        this.color = color;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Color: " + color);
    }

    @Override
    public String realizarAccion() {
        return "El gato maulla y se estira.";
    }
}
