package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o salário minimo atual: ");
        double salarioMin = leitor.nextDouble();

        System.out.println("Informe seu salário");
        double salarioPessoa = leitor.nextDouble();

        double qtSalario = salarioPessoa / salarioMin;

        System.out.println("Quantidade de salários mínimos  recebido: " + qtSalario);


    }

}
