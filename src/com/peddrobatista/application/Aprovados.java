package com.peddrobatista.application;

import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        double media;

        System.out.print("Quantos alunos serão digitados? ");
        n = teclado.nextInt();

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda do %do aluno:\n", i + 1);
            teclado.nextLine();
            nomes[i] = teclado.nextLine();
            nota1[i] = teclado.nextDouble();
            nota2[i] = teclado.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {
            media = (nota1[i] + nota2[i]) / 2;
            if(media >= 6.0) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        teclado.close();
    }
}
