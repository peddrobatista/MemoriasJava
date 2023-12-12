package com.peddrobatista.application;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números vão ter no vetor? ");
        int n = teclado.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = teclado.nextInt();
        }
        int sum = 0, npares = 0;
        for (int i = 0; i < n; i++) {
            if(vetor[i] % 2 == 0) {
                sum = sum + vetor[i];
                npares++;
            }
        }

        if (npares != 0) {
            double media = (double) sum / npares;
            System.out.printf("MÉDIA DOS PARES: %.2f%n", media);
        } else {
            System.out.println("NENHUM NÚMERO PAR!");
        }
        teclado.close();
    }
}
