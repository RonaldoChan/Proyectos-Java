package com.gm.mundopc;

class Monitor {

    private int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    public Monitor() {
        this.idMonitor = contadorMonitores++;
    }

    public Monitor(String marca, double tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    @Override
    public String toString() {
        return "\n***************Monitor: " + "\nidMonitor=" + idMonitor + "\nmarca=" + marca + "\ntamaño=" + tamaño;
    }
}
