//programa que realiza a comparacao entre inteiros utilizando o IF
//operadores relacionais e operadores de igualdade.
//Lucas Souza
// 15/03/2017 16:14 pm
package comparison;
import java.util.Scanner;// programa utiliza a classe scanner
public class Comparison {
    //metodo principal da aplicacao
    public static void main(String[] args) {
        //criacao do scanner para a leitura de dados
        Scanner input = new Scanner(System.in);
        
        int number1,//numero 1
            number2; //numero 2
        
        System.out.print("Enter first integer: ");//prompt 
        number1 = input.nextInt();//le o primeiro inteiro
        
        System.out.print("Enter second integer: ");//prompt
        number2 = input.nextInt();//le o segundo inteiro
        
        if (number1 == number2) 
            System.out.printf("%d == %d\n", number1, number2);
        
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);        
    }//final do metodo main    
}//final da classe Comparison
