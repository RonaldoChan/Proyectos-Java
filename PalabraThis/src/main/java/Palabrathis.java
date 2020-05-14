
public class Palabrathis {

    public static void main(String[] args) {

        Persona persona = new Persona("Juan");
        
    }
}

class Persona {

    String nombre;

    Persona(String nombre) {

        this.nombre = nombre;

        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);
    }

}

class Imprimir {

    public void imprimir(Persona p) {
        System.out.println("contenido de this dentro de persona: " + p);
        System.out.println("Contenido de this dentro de imprimir: " + this);
    }

}
