package Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {


        final int dias = 365;
        final var meses = 30;


        Scanner leitor = new Scanner(System.in);


        System.out.print("Informe sua idade: ");
        int leitorIdade = leitor.nextInt();
        leitorIdade = leitorIdade * dias;

        System.out.print("Meses: ");
        int leitorMeses = leitor.nextInt();
        leitorMeses = leitorMeses * meses;

        System.out.print("dias: ");
        int leitorDias= leitor.nextInt();

        //soma
        leitorDias += leitorMeses + leitorIdade;

        //saída resultado
        System.out.println("Sua idade é de " + leitorDias + " dias");



    }

}
