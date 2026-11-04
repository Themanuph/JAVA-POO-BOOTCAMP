/*
Archivo: Hormiguero.java
Descripcion: 
    Clase gestora que adminsitra la lista de hormigas.
    Aqui aplicamos coleccion, busquedas, logica basica.
*/


import java.util.ArrayList;

public class Hormiguero {
    // lista dinamica para almacenar himrigas
    private ArrayList<Hormiga> listaHormigas;

    // Constructor
    public Hormiguero(){
        listaHormigas = new ArrayList<>();
    }

    //Metodo para agregar una larva
    public void agregarlarva(int id){
        listaHormigas.add(new Larva(id));
        System.out.println("Larva agregada correctamente");
    }

    // Metodo para agregar un soldado
    public void agregarSoldado(int id){
        listaHormigas.add(new Soldado(id));
        System.out.println("Soldao agregado correctamente.");
    }

    public void mostrarHormigas(){
        if(listaHormigas.isEmpty()){
            System.out.println("No hay hormigas registradas");
            return;
        }

        for(Hormiga hormiga : listaHormigas){
            hormiga.mostrarInfo();
            hormiga.mostrarAccion();
            System.out.println("------------------------");
        }
    }

    //Metodo para buscar una hormiga por id
    public Hormiga buscarPorId(int id){
        for( Hormiga hormiga : listaHormigas){
            if(hormiga.getId() == id){
                return hormiga;
            }
        }
        return null;
    }


    public void alimentarHormigas(int id){
        Hormiga hormiga = buscarPorId(id);

        if( hormiga == null){
            System.out.println("no existe una hormiga con ese ID");
            return;
        }

        if (hormiga.getEstado().equals("MUERTA")){
            System.out.println("no se puede alimentar una hormiga muerta");
            return;
        }

        System.out.println("Hormiga encontrada: ");
        hormiga.mostrarInfo();
        System.out.println("La hormiga ha sido alimetnada correctamente");
    }


    

}
