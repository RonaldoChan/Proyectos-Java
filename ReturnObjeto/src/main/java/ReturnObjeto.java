
import java.util.Scanner;

public class ReturnObjeto {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione un numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Proporcione otro numero: ");
        int n2 = scanner.nextInt();
        
        Sumar s = crearObjeto();
        
        int resultado = s.suma(n1, n2);
        System.out.println("resultado = " + resultado);
        
    }
    
    private static Sumar crearObjeto() {
        return new Sumar();
    }
    
}
