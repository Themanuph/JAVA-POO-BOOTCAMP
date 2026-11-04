public class Larva extends Hormiga {
    public Larva(int id){
        // Llamos al constructor de la clase padre
        super(id, "Lava");
    }

    @Override 
    public void mostrarAccion(){
        System.out.println("La larva esta creciendo dentro del hormiguero");
    }

}
