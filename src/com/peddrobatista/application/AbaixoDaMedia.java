package com.peddrobatista.application;

import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos elementos vão ter no vetor? ");
        int n = teclado.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = teclado.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vetor[i];
        }

        double media = sum / n;
        System.out.printf("MÉDIA DO VETOR: %.2f%n", media);
        System.out.println();
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < n; i++) {
            if(vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
        teclado.close();
    }
}
