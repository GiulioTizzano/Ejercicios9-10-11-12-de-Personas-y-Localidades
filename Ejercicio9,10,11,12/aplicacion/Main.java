package aplicacion;
import dominio.Localidad;
import dominio.Persona;

public class Main {

    public static void main(String args[]) {
        Localidad L1 = new Localidad("Alicante", 300000);
        Persona P1 = new Persona("Giulio", 1967, L1);
        System.out.println(P1);
        System.out.println(L1);

        // 4. Los objetos se almacenan en memoria por paso de parámetro de valor,
        // es decir se pasa una variable como valor de entrada de parámetro
        // posteriormente creando un objeto que apunta al otro objeto
        // En este caso creamos los objetos P1 y L1, pero P1 apunta con un puntero
        // al contenido de L1 que contiene el nombre de la localidad y el numero de habitantes.

        // 3. Un método estático en Java es un método que solamente le pertence a la clase
        // y no al objeto.

        // 4. Public se refiere a que una clase es visible para todas las clases, Private se
        // refiere a que la clase no es visible para todas las clases. Para los métodos, si un método es
        // public, entonces eso quiere decir que el método es accesible desde cualquier clase. En cambio,
        // si es private, quiere decir que sólo es accesible en la clase donde se ha definido.
        
        // 5. Cuando un miembro de una clase no tiene modificador de acceso, java le asigna un modificador
        // de acceso default por defecto, es decir que es accesible en la clase donde se declara dicho miembro
        // y en el paquete también.
    }
}