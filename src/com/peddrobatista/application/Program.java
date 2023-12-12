package com.peddrobatista.application;

import com.peddrobatista.classes.Produto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length; i ++) {
            teclado.nextLine();
            String name = teclado.nextLine();
            double price = teclado.nextDouble();
            vect[i] = new Produto(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE: %.2f%n", avg);
        teclado.close();
    }
}
