package com.peddrobatista.application;

import java.util.Scanner;

public class SomarVetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = teclado.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = teclado.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        System.out.println();
        System.out.print("SOMA = ");
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        System.out.print(sum);

        System.out.println();
        double media = sum / vect.length;
        System.out.println("MÉDIA = " + media);
    }
}
