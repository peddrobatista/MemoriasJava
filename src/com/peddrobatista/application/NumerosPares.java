package com.peddrobatista.application;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = teclado.nextInt();
        int[] numero = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numero[i] = teclado.nextInt();
        }

        System.out.println("NÚMEROS PARES:");
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (numero[i] % 2 == 0) {
                cont = cont + 1;
                System.out.print(numero[i] + " ");
            }
        }
        System.out.println();
        System.out.println("QUANTIDADES DE PARES: " + cont);
        teclado.close();
    }
}
