package com.peddrobatista.application;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, maioridade, posicaomaior;

        System.out.print("Quantas pessoas vai digitar? ");
        n = teclado.nextInt();
        int[] vetor = new int[n];

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nome[i] = teclado.next();
            System.out.print("Idade: ");
            idade[i] = teclado.nextInt();
        }

        maioridade = idade[0];
        posicaomaior = 0;
        for (int i=1; i<n; i++) {
            if (idade[i] > maioridade) {
                maioridade = idade[i];
                posicaomaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA:  %s\n", nome[posicaomaior]);
        teclado.close();
    }
}
