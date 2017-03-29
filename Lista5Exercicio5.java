package lista5exercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Lista5Exercicio5 {

    public static void main(String[] args) {
        int[] x = new int[10];
        int[] y = new int[10];

        System.out.println("CALCULADORA DE VETORES!");

        setVetor(x, "X");
        setVetor(y, "Y");

        imprimeVetor(x, "X");
        imprimeVetor(y, "Y");

        imprimeVetor(somaVetor(x, y), "SOMA X e Y");
        imprimeVetor(produtoVetor(x, y), "PRODUTO X e Y");
        imprimeVetor(interseccaoVetor(x, y), "INTERSECCAO X e Y");
        imprimeVetor(uniaoVetor(x, y), "UNIAO X e Y");
        imprimeVetor(diferencaVetor(x, y), "DIFERENCA X e Y");
        imprimeVetor(diferencaVetor(y, x), "DIFERENCA Y e X");

    }

    public static int[] setVetor(int[] vetor, String nomeVetor) {
        Scanner entrada = new Scanner(System.in);
        for (int cont = 0; cont < vetor.length; cont++) {
            System.out.printf("\nDigite o elemento %d do vetor %s: ", cont + 1, nomeVetor);
            vetor[cont] = entrada.nextInt();
        }
        return (vetor);
    }

    public static void imprimeVetor(int[] vetor, String nomeVetor) {

        System.out.printf("\n\nVETOR %s: \n\n", nomeVetor);

        for (int cont = 0; cont < vetor.length; cont++) {
            System.out.printf("%d - ", vetor[cont]);
        }
        System.out.printf("\n\n");
    }

    public static int[] somaVetor(int[] vetor1, int[] vetor2) {

        if (vetor1.length != vetor2.length) {
            throw new RuntimeException("Vetores possuem tamanhos diferentes!");
        } else {

            int[] resultado = new int[10];

            for (int cont = 0; cont < resultado.length; cont++) {
                resultado[cont] = vetor1[cont] + vetor2[cont];
            }

            return (resultado);
        }
    }

    public static int[] produtoVetor(int[] vetor1, int[] vetor2) {

        if (vetor1.length != vetor2.length) {
            throw new RuntimeException("Vetores possuem tamanhos diferentes!");
        } else {

            int[] resultado = new int[vetor1.length];

            for (int cont = 0; cont < resultado.length; cont++) {
                resultado[cont] = vetor1[cont] * vetor2[cont];
            }

            return (resultado);
        }
    }

    public static int[] interseccaoVetor(int[] vetor1, int[] vetor2) {

        int cont = 0; //contador para criação do vetor resultado, e para a inserção de dados obtidos após processamento no vetor resultado
        int[] aux = new int[vetor1.length]; //vetor inicial temporário, com tamanho do primeiro parâmetro, para receber os números processados.
        boolean isRepetido, hasZero = false;

        for (int contI = 0; contI < vetor1.length; contI++) {
            for (int contJ = 0; contJ < vetor2.length; contJ++) {
                if (vetor1[contI] == vetor2[contJ]) { //Se os valores forem iguais

                    isRepetido = false;

                    for (int contAux = 0; contAux < aux.length; contAux++) { //Verifica se o número já existe no vetor aux
                        if (vetor1[contI] == aux[contAux]) {
                            if (vetor1[contI] == 0 && aux[contAux] == 0 && hasZero == false) { //Verifica se os valores encontrados são zeros. Caso nenhum zero tenha sido testado antes, ele dá break sem atribuir true para repetido.
                                hasZero = true;
                                break;
                            } else {
                                isRepetido = true;
                                break;
                            }
                        }
                    }

                    if (isRepetido == false) { //Insere o valor em aux, se o número não estiver repetido dentro do vetor aux.
                        aux[cont] = vetor1[contI];
                        cont++;
                    }

                }

            }
        }

        int[] resultado = new int[cont];

        System.arraycopy(aux, 0, resultado, 0, resultado.length); //Transfere os dados do vetor aux para o vetor resultado

        Arrays.sort(resultado);

        System.out.printf("\nTamanho do vetor retornado: %d\n", resultado.length); // Informa no console o tamanho do vetor retornado.

        return (resultado);
    }

    public static int[] uniaoVetor(int[] vetor1, int[] vetor2) {

        boolean hasZero = false;

        for (int contI = 0; contI < vetor1.length; contI++) {

            if (vetor1[contI] == 0) {
                hasZero = true;
                break;
            }

        }

        for (int contI = 0; contI < vetor2.length; contI++) {

            if (vetor2[contI] == 0) {

                hasZero = true;
                break;

            }

        }

        int contTotalElementos = 0;

        int[] aux = new int[vetor1.length + vetor2.length];

        boolean isContained;

        for (int contI = 0; contI < vetor1.length; contI++) {

            isContained = false;

            if (vetor1[contI] != 0) {

                for (int contJ = 0; contJ < aux.length; contJ++) {

                    if (vetor1[contI] == aux[contJ]) {

                        isContained = true;
                        break;

                    }

                }

                if (isContained == false) {

                    aux[contTotalElementos] = vetor1[contI];
                    contTotalElementos++;

                }

            }

        }

        for (int contI = 0; contI < vetor2.length; contI++) {

            isContained = false;

            if (vetor2[contI] != 0) {

                for (int contJ = 0; contJ < aux.length; contJ++) {

                    if (vetor2[contI] == aux[contJ]) {
                        isContained = true;
                        break;
                    }

                }

                if (isContained == false) {
                    aux[contTotalElementos] = vetor2[contI];
                    contTotalElementos++;
                }

            }

        }

        if (hasZero) {
            contTotalElementos++;
        }

        int[] resultado = new int[contTotalElementos];

        System.arraycopy(aux, 0, resultado, 0, resultado.length);

        Arrays.sort(resultado);

        System.out.printf("\nTamanho do vetor retornado: %d\n", resultado.length); // Informa no console o tamanho do vetor retornado.

        return (resultado);
    }

    public static int[] diferencaVetor(int[] vetor1, int[] vetor2) { //necessário implementar

        boolean hasZeroInVetor1 = false, hasZeroInVetor2 = false;

        for (int contI = 0; contI < vetor1.length; contI++) {

            if (vetor1[contI] == 0) {
                hasZeroInVetor1 = true;
                break;
            }

        }

        for (int contI = 0; contI < vetor2.length; contI++) {

            if (vetor2[contI] == 0) {

                hasZeroInVetor2 = true;
                break;

            }

        }

        int contTotalElementos = 0;

        int[] aux = new int[vetor1.length];

        boolean isContained, isContainedInAux;

        for (int contI = 0; contI < vetor1.length; contI++) {

            isContained = false;

            for (int contJ = 0; contJ < vetor2.length; contJ++) {

                if (vetor1[contI] == vetor2[contJ]) {
                    isContained = true;
                }

            }

            if (isContained == false) {

                isContainedInAux = false;

                for (int contAux = 0; contAux < aux.length; contAux++) {

                    if (vetor1[contI] == aux[contAux]) {

                        isContainedInAux = true;
                        break;

                    }

                }

                if (isContainedInAux == false) {

                    aux[contTotalElementos] = vetor1[contI];
                    contTotalElementos++;

                }

            }

        }

        if (hasZeroInVetor1 == true && hasZeroInVetor2 == false) {
            contTotalElementos++;
        }

        int[] resultado = new int[contTotalElementos];

        System.arraycopy(aux, 0, resultado, 0, resultado.length);

        Arrays.sort(resultado);

        System.out.printf("\nTamanho do vetor retornado: %d\n", resultado.length); // Informa no console o tamanho do vetor retornado.

        return (resultado);
    }

}