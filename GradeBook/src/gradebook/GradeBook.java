//declaracao da Classe com um metodo
//Lucas Souza
//Create 17/03/2017 12:00 am
package gradebook;
public class GradeBook {
    private String courseName; //nome do curso para esse GradeBook
    
    //metodo para configurar o nome do curso
    public void setCurseName( String name){
        courseName = name;//armazena o nome do curso
    }//fim do metodo setCurseName

    //metodo para recuperar o nome do curso
    public String getCourseName() {
        return courseName;
    }//fim do metodo getCourseName
    
    //exibe uma mensagem para o usuario do Grade Book
    public void displayMessage(){
        //chama o getCourseName para obter o nome do
        //curso que essa GradeBook representa
        System.out.printf("Welcome to the Grande Book for\n%s!\n", getCourseName());
    }//fim do metodo displayMessage
}//fim da classe GradeBook
