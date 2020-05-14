
public class Persona {

    private String nombre;
    private String apellido;
    private String ocupacion;
    private int edad;
    
    Persona(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
//    public void setNombre(String nombre){
//        this.nombre = nombre;
//    }
//    public String getNombre() {
//        return nombre;
//    }
//    
//    public void setApellido(String apellido){
//        this.apellido = apellido;
//    }
//    public String getApellido(){
//        return apellido;
//    }
//    
//    public void setOcupacion(String ocupacion){
//        this.ocupacion = ocupacion;
//    }
//    public String getOcupacion(){
//        return ocupacion;
//    }
//    
//    public void setEdad(int edad){
//        this.edad = edad;
//    }
//    public int getEdad(){
//        return edad;
//    }
   
    @Override
    public String toString(){
        return "\nNombre: " + nombre +"\nApellido: " + apellido + "\nOcupacion: " + ocupacion + "\nEdad: " + edad;
    }

   
//    public String toString() {
//        return "Persona{" + "nombre=" + nombre + " apellido=" + apellido + ", ocupacion=" + ocupacion + ", edad=" + edad + '}';
//    }
    
    
    
    
    
}
