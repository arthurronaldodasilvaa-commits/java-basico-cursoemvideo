package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.print("\nA nota é: " + nota + "\n");
        System.out.println("A nota é: " + nota);
        System.out.printf("A nota de %s é: %.2f \n", nome, nota);
        System.out.format("A nota de %s é: %.2f \n", nome, nota);
    }
    
}
