
public class PalabraNull {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");

        Persona persona2 = persona1;
        System.out.println("persona= " + persona1.obtenernombre());
        persona1 = null;
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);

    }
}

class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    public String obtenernombre() {
        return nombre;
        
    }

}
