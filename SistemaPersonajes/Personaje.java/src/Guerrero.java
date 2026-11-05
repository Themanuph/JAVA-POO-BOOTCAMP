public class Guerrero extends Personaje {

    public Guerrero(int id, String nombre, int nivel) {
        super(id, nombre, nivel);
    }

    @Override
    public String realizarAccion() {
        return "El guerrero ataca con su espada.";
    }
}
