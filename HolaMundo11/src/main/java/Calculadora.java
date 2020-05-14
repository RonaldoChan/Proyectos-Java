
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        //int suma = 0;
        System.out.println("Digite el primer numero: ");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        System.out.println("Digite el segundo: ");
        String n2 = scanner.nextLine();
        String suma = n1 + n2;
        System.out.println("La suma es: " + suma);

    }

}
