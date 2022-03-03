package br.com;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numA = scn.nextInt();
        System.out.println("Digite outro numero: ");
        int numB = scn.nextInt();

        System.out.println("Soma: " + (numA + numB));
    }
}
