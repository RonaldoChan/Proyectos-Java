
public class PruebaCaja {
    
    public static void main(String[] args) {
        //alto=2
        //ancho=3
        //profundo=6
        Caja objeto1 = new Caja(2, 3, 6);
        
        int volumen = objeto1.volumen();
        
        System.out.println("volumen = " + volumen);
        
    }
    
}
