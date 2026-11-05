import java.util.ArrayList;

public class Refugio {

    private ArrayList<Animal> animales;

    public Refugio() {
        animales = new ArrayList<>();
    }

    // REGISTRAR ANIMAL

    public boolean registrarAnimal(Animal animal) {

        if (animal == null) {
            return false;
        }

        if (buscarPorId(animal.getId()) != null) {
            return false;
        }

        animales.add(animal);

        return true;
    }

    // BUSCAR POR ID

    public Animal buscarPorId(int id) {

        for (Animal animal : animales) {

            if (animal.getId() == id) {
                return animal;
            }
        }

        return null;
    }

    // MOSTRAR ANIMALES

    public void mostrarAnimales() {

        if (animales.isEmpty()) {

            System.out.println("No hay animales registrados.");
            return;
        }

        for (Animal animal : animales) {

            animal.mostrarInformacion();

            System.out.println("Accion: "
                + animal.realizarAccion());

            System.out.println("-------------------------");
        }
    }

    // ADOPTAR ANIMAL

    public boolean adoptarAnimal(int id) {

        Animal animal = buscarPorId(id);

        if (animal == null) {
            return false;
        }

        if (animal.getEstado().equals("ADOPTADO")) {
            return false;
        }

        animal.setEstado("ADOPTADO");

        return true;
    }

    // COMPROBAR SI ESTA VACIO

    public boolean estaVacio() {
        return animales.isEmpty();
    }
}