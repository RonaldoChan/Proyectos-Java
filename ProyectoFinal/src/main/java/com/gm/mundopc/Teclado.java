package com.gm.mundopc;

class Teclado extends DispositivoEntrada{
    
    private int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        idTeclado = contadorTeclado++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n***************Teclado: " + "\nidTeclado=" + idTeclado;
    }
    
    
}
