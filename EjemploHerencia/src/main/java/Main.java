
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Pepe",5000);
        empleado1.setEdad(18);
        empleado1.setDireccion("La concha de tu hermana");
        empleado1.setGenero('M');
        System.out.println("\n\nempleado1 : " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true );
        cliente1.setDireccion("Lomas Turbas");
        cliente1.setEdad(25);
        cliente1.setGenero('F');
        cliente1.setNombre("Papo");
        System.out.println("\n\ncliente1 = " + cliente1);
    }
}
