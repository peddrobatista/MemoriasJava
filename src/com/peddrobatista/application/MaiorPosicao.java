package com.peddrobatista.application;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = teclado.nextInt();
        int posmaior;
        double maior;
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = teclado.nextDouble();
        }

        maior = vetor[0];
        posmaior = 0;

        for (int i=1; i<n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posmaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

        teclado.close();
    }
}
