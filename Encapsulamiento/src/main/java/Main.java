
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        //ingresar datos 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese Apellido");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese Sueldo");
        int sueldo = scanner.nextInt();
        
        //llenar datos 
        Persona persona1 = new Persona();
        persona1.setNombre(nombre);
        persona1.setApellido(apellido);
        persona1.setSueldo(sueldo);
        
        System.out.println("Persona1\n" + persona1);
        
//        System.out.println("El nombre es: " + persona1.getNombre());
//        System.out.println("El apellido es: " + persona1.getApellido());
//        System.out.println("El sueldo es: " + persona1.getSueldo());

        
    }
    
}
