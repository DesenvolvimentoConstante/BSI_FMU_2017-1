/*
 * Programa desenvolvido por Felippe Wohlers Leão
 * Para alterar esse cabeçalho, clique em "Ferramentas" | "Cabeçalhos da Licença"
 * e abra o modelo no editor.
 */
package usaaluno;

import java.util.Scanner;

/**
 *
 * @author Leaum
 */
public class UsaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Scanner entrada = new Scanner(System.in);

        System.out.printf("\nDigite o nome do aluno: ");
        a1.setNome(entrada.nextLine());

        System.out.printf("\nDigite o valor atual da mensalidade: R$");
        a1.setValorMensalidade(entrada.nextDouble());

        System.out.printf("\nDigite o percentual do aumento: ");
        a1.aumento(entrada.nextDouble());

        System.out.printf("\n\nO novo valor da mensalidade com o aumento é de: R$%.2f\n\n", a1.getValorMensalidade());
        a1.setNome(entrada.nextLine());

    }

}