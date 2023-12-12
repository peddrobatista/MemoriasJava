package com.peddrobatista.application;

import java.util.Scanner;

public class InteriosNegativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = teclado.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = teclado.nextInt();
        }

        for (int i = 0; i < vect.length; i++) {
            if(vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        teclado.close();
    }
}
