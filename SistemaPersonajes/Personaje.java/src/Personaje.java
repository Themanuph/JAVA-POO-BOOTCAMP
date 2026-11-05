public class Personaje {

    private int id;
    private String nombre;
    private int nivel;

    public Personaje(int id, String nombre, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
    }

    public String realizarAccion() {
        return "El personaje realiza una accion.";
    }
}