package com.peddrobatista.application;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = teclado.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i=0; i<n; i++) {
            a[i] = teclado.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i=0; i<n; i++) {
            b[i] = teclado.nextInt();
        }

        for (int i=0; i<n; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i=0; i<n; i++) {
            System.out.printf("%d\n", c[i]);
        }

        teclado.close();
    }
}
