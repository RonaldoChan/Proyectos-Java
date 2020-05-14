public class Caja {
    //atributos de la clase 
    int ancho;
    int alto;
    int profundo;
    
    //constructor vacio
    public Caja(){
        System.out.println("Ejecutando constructor vacio");
    }
    
    //constructor con 3 argumentos
    public Caja(int alto,int ancho,int profundo){
        System.out.println("Ejecutando constructor con 3 argumentos");
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    
    //metodo de la clase que utiliza variable de la clase
    public int volumen(){
        int resultado = alto*ancho*profundo;
        return resultado;
     }
}
