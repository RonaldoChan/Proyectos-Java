package arreglos;

public class Main {

    public static void main(String[] args) {
        //declarar una variable de tipo arreglo
        int edades[];
        //instanciar el arroglo de tipo int
        edades = new int [3];
        //inicializamos los valores del arreglo
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        
        System.out.println("arreglo de enteros indice 0: " + edades[0] );
        System.out.println("arreglo de enteros indice 1: " + edades[1] );
        System.out.println("arreglo de enteros indice 2: " + edades[2] );
        //declaramos e instanciamos un arreglo de tipo object
        Persona personas[] = new Persona[4];
        //inicializamos las variables 
        personas[0] = new Persona("juan");
        personas[1] = new Persona("pepe");
        personas[2] = new Persona("mario");
        personas[3] = new Persona("pepa");
        
        System.out.println("perosna 0 = " + personas[0]);
        System.out.println("perosna 1 = " + personas[1]);
        System.out.println("perosna 2 = " + personas[2]);
        System.out.println("perosna 3 = " + personas[3]);
        
    }

}
