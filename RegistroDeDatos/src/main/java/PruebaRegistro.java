
import java.util.Scanner;

public class PruebaRegistro {

    public static void main(String[] args) {

        String nombre=null;
        String apellido=null;
        
        do{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese apellido");
        apellido = scanner.nextLine();
        }while(nombre != apellido);

        Registro registro = new Registro();
        
        registro.nombre = nombre;
        registro.apellido = apellido;

    }

}
