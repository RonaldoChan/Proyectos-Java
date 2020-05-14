package Matrices;

import java.util.Scanner;

public class Main  {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int matriz[][]=null;
        int filas;
        int columans;
        
        matriz = filasColumnas(matriz);
        ingresarValores(matriz);
    }//cierra metodo main

    private static int[][] filasColumnas(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de filas");
        int filas = Integer.parseInt(scanner.nextLine());
        System.out.println("ingrese el numero de columnas");
        int columnas = Integer.parseInt(scanner.nextLine());
        
        int[][] x = new int[filas][columnas];
        return x;          
    }//cierra metodo filasColumnas
    
    private static void ingresarValores(int x[][]){
        
        
        for (int[] x1 : x) {
            for (int j = 0; j < x1.length; j++) {
                System.out.println("Ingresar valores de la matriz: ");
                x1[j] = Integer.parseInt(scanner.nextLine());
            }
        }
    }//cierra metodo ingresarValores
    
}//cierra clase
