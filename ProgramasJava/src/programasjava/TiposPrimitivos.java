package programasjava;
import java.util.Scanner;
public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        System.out.format("A nota do %s é %.1f \n ", nome, nota);
    }
}
