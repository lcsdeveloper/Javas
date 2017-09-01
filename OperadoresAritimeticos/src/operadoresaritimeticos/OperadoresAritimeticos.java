
package operadoresaritimeticos;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/2;       
        
        System.out.println("A média é igual a: " + media);
        
        int numero = 5;
        //int valor = 5 + numero++;
        int valor = 5 + ++numero;
        
        System.out.println(valor);
    }
    
}
