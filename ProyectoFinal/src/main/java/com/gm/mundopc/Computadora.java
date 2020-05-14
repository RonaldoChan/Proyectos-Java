package com.gm.mundopc;

public class Computadora{

    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadora;
    
    public Computadora(){}

    public Computadora(String nombre,Monitor monitor, Teclado teclado,Raton raton) {
        this.idComputadora = contadorComputadora++;
        this.nombre = nombre;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorComputadora() {
        return contadorComputadora;
    }

    @Override
    public String toString() {
        return "\nComputadora: " + "\nidComputadora=" + idComputadora + "\nnombre= " + nombre + monitor + teclado + raton ;
    }
    
}
