public class Perro extends Animal {

    private String raza;

    public Perro(int id, String nombre, int edad, String raza) {

        super(id, nombre, edad);

        if (raza == null || raza.trim().isEmpty()) {
            throw new IllegalArgumentException("La raza no puede estar vacia.");
        }

        this.raza = raza;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Raza: " + raza);
    }

    @Override
    public String realizarAccion() {

        return "El perro mueve la cola y ladra.";
    }
}