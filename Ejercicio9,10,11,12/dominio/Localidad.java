package dominio;

public class Localidad {
    private String nombreLocalidad;
    private int numeroDeHabitantes;
    
    
    public Localidad(String nombreLocalidad, int numeroDeHabitantes) {
        this.nombreLocalidad = nombreLocalidad;
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    public int getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }
    public void setNumeroDeHabitantes(int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes; 
    }
    public String getNombre(String nombreLocalidad) {
        return nombreLocalidad;
    }
    public void setNombre(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public String toString() {

        return "El nombre de la localidad es " + nombreLocalidad + "\n y el numero de habitantes es " + numeroDeHabitantes ;
    }




}
