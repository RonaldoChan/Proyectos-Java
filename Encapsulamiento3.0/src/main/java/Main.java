
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas: ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la ocupacion: ");
        String ocupacion = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        
        Persona persona1 = new Persona(); 
        

        persona1.setNombre(nombre);
        persona1.setApellido(apellido);
        persona1.setOcupacion(ocupacion);
        persona1.setEdad(edad);

        //for (int i = 1; i <= n; i++) {

        System.out.println("\n\nPesona: "  + persona1.toString() );
       // }

    }

}
