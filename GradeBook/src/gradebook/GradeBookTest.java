//criando um objeto GradeBook e chamando o seu metodo displayMessage
//Lucas Souza
//13/03/2017 12:08 am
package gradebook;

import java.util.Scanner;//scanner

public class GradeBookTest {
    //metodo main que inicia a execucao do programa
    public static void main( String[] args ){
        //criar o Scanner para obter a entrada de dados
        Scanner input = new Scanner( System.in);
        
        //instanciando o objeto GradeBook e o atribuindo a myGradeBook
        GradeBook myGradeBook = new GradeBook();
        
        //prompt para a entrada de dados
        System.out.println("Please enter ther course name: ");
        String theName = input.nextLine();//le na linha do texto
        myGradeBook.setCurseName(theName);//configura o nome do curso
        System.out.println();//gera saida de uma linha em branco
        
        
        //exibe a mensagem de boas vindas depois de especificar
        //o nome do curso
        myGradeBook.displayMessage();
    }//fim do metodo main
}//fim da classe GradeBookTest
