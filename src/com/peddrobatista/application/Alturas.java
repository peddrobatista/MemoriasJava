package com.peddrobatista.application;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        int n = teclado.nextInt();
        double[] vect = new double[n];

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = teclado.next();
            System.out.print("Idade: ");
            idades[i] = teclado.nextInt();
            System.out.print("Altura: ");
            alturas[i] = teclado.nextDouble();

        }
        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma = soma + alturas[i];
        }

        double mediaAlturas = soma / vect.length;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        int cont = 0;
        for (int i = 0; i < vect.length; i++) {
            if (idades[i] < 16) {
                cont = cont + 1;
            }
        }

        double percent = cont * 100.0 / vect.length;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for (int i = 0; i < vect.length; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
        teclado.close();
    }
}
