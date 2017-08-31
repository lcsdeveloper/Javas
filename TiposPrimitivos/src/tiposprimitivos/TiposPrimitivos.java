package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        //float nota = 8.5f;
        //String nome = "Lucas";
        //float nota = (float) 8.5f; TypeCast
        
        //System.out.println("A nota é " + nota);
        //System.out.printf("A nota de %s é %.2f \n",nome, nota);//formatado
        System.out.format("A nota de %s é %.2f \n",nome, nota);//format                
    }    
}
