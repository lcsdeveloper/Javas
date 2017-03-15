//programa que realiza a soma simples de dois numeros fornecidos pelos usuario
//Lucas Souza
// 15/03/2017 11:22 am
package addition;
import java.util.Scanner; // programa utiliza a classe scanner
public class Addition {
    //metodo principal
    public static void main(String[] args) {
        //criando um scanner
        Scanner input = new Scanner( System.in);
        
        int number1,//numero 1
            number2, //numero 2
            sum; //variavel que obtera a soma entre os numeros
        
        System.out.print("Enter first integer: "); //prompt
        number1 = input.nextInt(); //le o primeiro numero
        
        System.out.print("Enter second integer: "); //prompt
        number2 = input.nextInt(); //le o segundo numero
        
        sum = number1 + number2; //proc da soma dos dois numeros
        
        System.out.printf("Sum is %d\n", sum);
    }//fim metodo main    
}//fim classe addtion
