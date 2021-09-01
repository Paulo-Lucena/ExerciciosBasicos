package Exercicios;

import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<Double> conjuto1 = new ArrayList<>();
        ArrayList<Double> conjuto2 = new ArrayList<>();

        //adiciona notas conjunto 1
        conjuto1.add(8d);
        conjuto1.add(9d);
        conjuto1.add(7d);

        //adiciona notas conjunto 2
        conjuto2.add(4d);
        conjuto2.add(5d);
        conjuto2.add(6d);


        //média conjunto 1
        double media1 = 0;
        for (double i :conjuto1){
            media1 += i / conjuto1.size() ;
        }

        //média conjunto 2
        double media2 = 0;
        for (double i :conjuto2){
            media2 += i / conjuto2.size() ;
        }

        //soma das médias
        double somaMedia = media1 + media2;

        //média das médias
        double mediaMedia = somaMedia / 2;


        //Saídas
        System.out.printf("Média dos números 8, 9 e 7:  %.2f\n",media1);
        System.out.printf("Média dos números 4, 5 e 6:  %.2f\n",media2);
        System.out.printf("Soma das médias %.2f\n",somaMedia);
        System.out.printf("Média das médias %.2f\n",mediaMedia);
    }
}
