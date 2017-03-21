/*
 * Programa desenvolvido por Felippe Wohlers Leão
 */
package lista7exercicio1;

import java.util.Scanner;

public class Lista7Exercicio1 {

    public static int verificaSinal(int n) {

        if (n > 0) {
            return (1);
        } else if (n < 0) {
            return (0);
        } else {
            return (-1);
        }

    }

    public static void main(String[] args) {

        Scanner aux = new Scanner(System.in);
        int n;

        System.out.println("VERIFICADOR DE SINAL! \n\nSe o número for positivo, o programa retornará 1.\nDo contrário, se for negativo, retornará zero.\nO sistema retornará -1 caso o número não tenha um sinal atribuído (0).\n\n");

        while (true) {
            System.out.printf("\nDigite um número inteiro: ");
            n = aux.nextInt();
            System.out.println(verificaSinal(n));
        }
    }

}
