/*
 * Programa desenvolvido por Felippe Wohlers Leão
 */
package lista7exercicio3;

import java.util.Scanner;

public class Lista7Exercicio3 {

    public static int somaDivisiveisDeA(int a, int b, int c) {
        if (a > 1) {
            int soma = 0;

            for (int i = b; i < c; i++) {
                if (i % a == 0) {
                    soma += i;
                }
            }

            return (soma);

        } else {
            System.out.println("\nA deve ser maior que 1. Digite outro número.\n");
            return (0);
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner entrada = new Scanner(System.in);

        System.out.println("CALCULA SOMA DOS DIVISIVEIS DE A.");

        while (true) {
            System.out.printf("\nDigite A: ");
            a = entrada.nextInt();
            System.out.printf("\nDigite B: ");
            b = entrada.nextInt();
            System.out.printf("\nDigite C: ");
            c = entrada.nextInt();
            System.out.printf("\n\nA soma dos inteiros situados entre %d e %d , que são divisíveis por %d é de: %d !\n\n", b, c, a, somaDivisiveisDeA(a, b, c));
        }
    }

}
