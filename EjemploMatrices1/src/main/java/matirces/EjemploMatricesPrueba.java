package matirces;

public class EjemploMatricesPrueba {

    public static void main(String[] args) {
        //declaramos una matriz int      
        int edades[][];
        //instanciar
        edades = new int[3][2];
        //llenar la amtriz
        edades[0][0] = 1;
        edades[0][1] = 2;
        edades[1][0] = 3;
        edades[1][1] = 4;
        edades[2][0] = 5;
        edades[2][1] = 6;

        System.out.println("elemento: " + edades[0][0]);
        System.out.println("elemento: " + edades[0][1]);
        System.out.println("elemento: " + edades[1][0]);
        System.out.println("elemento: " + edades[1][1]);
        System.out.println("elemento: " + edades[2][0]);
        System.out.println("elemento: " + edades[2][1]);

        //declarar la matriz de tipo persona
        Persona personas[][] = new Persona[5][5];

        personas[0][0] = new Persona("juan");
        personas[0][1] = new Persona("Pepe");
        personas[0][2] = new Persona("mario");
        personas[0][3] = new Persona("raul");
        personas[0][4] = new Persona("roman");
        personas[1][1] = new Persona("Pep");

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("persona: " + personas[i][j]);
            }

        }

    }

}
