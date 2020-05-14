package com.gm.mundopc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de Computadoras: ");
        int nCompu = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el tipo de entrada para el monitor: ");
        String tipoMonitor = scanner.nextLine();
        System.out.println("Ingrese el tamaño del monitor: ");
        double tamañoMonitor = Integer.parseInt(scanner.nextLine());
        Monitor monitor1 = new Monitor(tipoMonitor, tamañoMonitor);

        System.out.println("Ingrese el tipo de entrada para el teclado ");
        String tipoTeclado = scanner.nextLine();
        System.out.println("Ingrese la marca del Teclado: ");
        String marcaTeclado = scanner.nextLine();
        Teclado teclado1 = new Teclado(tipoTeclado, marcaTeclado);

        System.out.println("Ingrese el tipo de entrada para el Raton ");
        String tipoRaton = scanner.nextLine();
        System.out.println("Ingrese la marca del Raton ");
        String marcaRaton = scanner.nextLine();
        Raton raton1 = new Raton(tipoRaton, marcaRaton);

        System.out.println("Ingrese el nombre para la computadora: ");
        String nombreComp = scanner.next();
        Computadora computadora1 = new Computadora(nombreComp, monitor1, teclado1, raton1);

        System.out.println("computadora1 = " + computadora1.toString());

    }

}
