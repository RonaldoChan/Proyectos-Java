
public class PalabraReturn {

    public static void main(String[] args) {

        sumarSinRetornarValor(5, 15);
        sumarRetornandoValor(10,15);
    }

    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("El resultado de sumar sin retornar valor: " + (a + b));
    }

    private static int sumarRetornandoValor(int a, int b) {

        return (a+b);
    }
    
    
    
}
