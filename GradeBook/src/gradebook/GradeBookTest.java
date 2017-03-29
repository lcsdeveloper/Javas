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
        
        //instanciando o objeto GradeBook 
        GradeBook gradeBook1 = new GradeBook("Introduce to Java Programming");
        GradeBook gradeBook2 = new GradeBook("Introduce to Java OOP");
        
        //prompt para a entrada de dados
        //System.out.println("Please enter ther course name: ");
        //String theName = input.nextLine();//le na linha do texto
        //myGradeBook.setCurseName(theName);//configura o nome do curso
        
        //exibe valor inicial de courseName para cada GradeBook
        System.out.printf("gradeBook1 course name is: %s\n", gradeBook1.getCourseName() );
        System.out.printf("gradeBook2 course name is %s\n", gradeBook2.getCourseName());
        
        //exibe a mensagem de boas vindas depois de especificar
        //o nome do curso
        //myGradeBook.displayMessage();
    }//fim do metodo main
}//fim da classe GradeBookTest
