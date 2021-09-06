package Exercicios;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva um número inteiro: ");
        int numero = leitor.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Número informado: " + numero);
        System.out.println("Número antecessor: " + antecessor);
        System.out.println("Número sucessor: " + sucessor);

    }
}
