
public class PasoPorValor {
    
    public static void main(String[] args) {

        int x = 10;
        System.out.println("x = " + x);

        cambiarValor(x);
        
        System.out.println("x = " + x);
    }

    public static void cambiarValor(int arg) {
        arg = 20;
        System.out.println("arg = " + arg);
    }

}
