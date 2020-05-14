package com.gm.mundopc;

public class Agregar {

    private Computadora computadora[];
    private int idAgregar;
    private static int contadorComputadoras;
    private static int contadorOrdenes;
    //private int nOrdenes;

    public Agregar(int nOrdenes) {
        idAgregar = contadorOrdenes++;
        computadora = new Computadora[nOrdenes];

    }

    public void AgregarComputadora(Computadora computadora) {
        this.computadora[contadorOrdenes++] = computadora;
           
    }

}
