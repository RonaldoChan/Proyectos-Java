
public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.cambiarNombre("JUAN");
        System.out.println("persona = " + persona.obtenerNmbre());
        
        
        modificarPersona(persona);
              
    }

    private static void modificarPersona(Persona personaArg) {
        personaArg.cambiarNombre("Carlos");
        
    }

}
