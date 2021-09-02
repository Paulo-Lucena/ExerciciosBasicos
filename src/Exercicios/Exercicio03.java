package Exercicios;

public class Exercicio03 {

    public static void main(String[] args) {

        double saldo = 1000;

        System.out.println("Seu saldo é de: " + saldo);

        saldo = (float) (saldo * 0.01)+saldo;

        System.out.printf("Saldo atualizado após a atualização 1%% : %.2f",saldo);



    }
}
