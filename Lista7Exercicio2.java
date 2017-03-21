/*
 * Programa desenvolvido por Felippe Wohlers Leão
 */
package lista7exercicio2;

import java.util.Scanner;

public class Lista7Exercicio2 {

    public static int somaIntervalo(int a, int b) {
        int soma = 0;

        if (a < b) {
            for (int i = (a + 1); i < b; i++) {
                soma += i;
            }

            return (soma);
        } else if (a > b) {
            for (int i = (b + 1); i < a; i++) {
                soma += i;
            }

            return (soma);
        } else {
            System.out.println("\nNão há números inteiros entre os parâmetros informados.");
            return (soma);
        }

    }

    public static void main(String[] args) {

        int a, b;
        Scanner entrada = new Scanner(System.in);

        System.out.println("SOMADOR DE INTERVALO DE INTEIROS!");

        while (true) {
            System.out.printf("\nDigite o primeiro número: ");
            a = entrada.nextInt();
            System.out.printf("\nDigite o segundo número: ");
            b = entrada.nextInt();
            System.out.printf("\n\nResultado: %d\n\n", somaIntervalo(a, b));
        }
    }

}
