public class Animal {

    private int id;
    private String nombre;
    private int edad;
    private String estado;

    public Animal(int id, String nombre, int edad) {

        if (id <= 0) {
            throw new IllegalArgumentException("El ID debe ser mayor que 0.");
        }

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = "DISPONIBLE";
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (!"DISPONIBLE".equals(estado) && !"ADOPTADO".equals(estado)) {
            throw new IllegalArgumentException("El estado debe ser DISPONIBLE o ADOPTADO.");
        }
        this.estado = estado;
    }

    public void mostrarInformacion() {

        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Estado: " + estado);
    }

    public String realizarAccion() {
        return "El animal realiza una accion.";
    }
}
