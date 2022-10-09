package dominio;


public class Persona {
    // Declarando las variables 
    private Localidad lugarDeNacimiento;
    private int annoDeNacimiento;
    private String nombre;

    public Persona(String nombre_, int annoDeNacimiento_, Localidad lugarDeNacimiento_) {

        nombre = nombre_;
        annoDeNacimiento = annoDeNacimiento_;
        lugarDeNacimiento = lugarDeNacimiento_;

    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(String nombre) {
        return nombre;
    }

    public int getNacimiento() {
        return annoDeNacimiento;

    }

    public int setNacimiento(int annoDeNacimiento) {
        return annoDeNacimiento;

    }

    public Localidad getLugarNacimiento() {
        return lugarDeNacimiento;
    }

    public Localidad setLugarNacimiento() {
        return lugarDeNacimiento;

    }

    // Cuando no se usa el método String toString() e intentas printear en pantalla mediante
    // el System.out.println() el objeto que quieres printear, ésta lo que hará sera imprimir en pantalla
    // la referencia a un objeto predeterminado de java junto con su dirección en memoria, pero no 
    // imprimirá en pantalla el objeto que se desea en el primer lugar. Por eso, 
    // el método String toString() lo que hace es 'overwrite' el contenido del objeto 
    // nativo que viene en Java.




    public String toString() {


        return "Tu nombre es " + nombre + " y " + " Tu nacimiento es en " + annoDeNacimiento;

    }

}