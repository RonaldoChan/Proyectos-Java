
public class EjemploStatic {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("juancho");
        System.out.println("p1 = " + p1);
        
        Persona p2 = new Persona("karla");
        System.out.println("p2 = " + p2);
        
        Persona p3 = new Persona("pepe");
        System.out.println("p3 = " + Persona.getContadorPersonas());
        
        
        

    }

}
