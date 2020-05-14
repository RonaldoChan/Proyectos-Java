public class Persona {
    private int idPersona;
    private String nombre;//se asocia con un objeto
    private static int contadorPersonas;//se asocia con la clase
    
    public Persona(String nombre){
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }
    
    public int getIdPersona(){
         return idPersona;
    }   
//    public void setIdPersona(int idPersona){
//          this.idPersona = idPersona;
//    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
    
    @Override
    public String toString(){
        return "Id Persona: " + idPersona +", nombre: "+ nombre + ", contador personas: " + contadorPersonas;
    }
        
}
