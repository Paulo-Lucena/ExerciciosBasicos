package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        ProdutoClasse produto = new ProdutoClasse();
        ControllerProduto controllerProduto = new ControllerProduto();

        int codigo;
        int valor;
        int quantidade;
        double ipi;

        Scanner leitor = new Scanner(System.in);
        int opcao;

        System.out.println("Pressione a tecla 1 para adicionar o produto a lista ou outra tecla para cancelar: ");
        opcao = leitor.nextInt();

        if (opcao == 1) {

            System.out.println("Informe a Alíquota do IPI do produto: ");
            ipi = leitor.nextDouble();
            produto.setIpiP(ipi);

            System.out.print("Código produto: ");
            codigo = leitor.nextInt();
            produto.setCodP(codigo);

            System.out.print("Quantidade: ");
            valor = leitor.nextInt();
            produto.setQuantidadeP(valor);

            System.out.print("Valor: ");
            quantidade = leitor.nextInt();
            produto.setValorP(quantidade);

            controllerProduto.adicionar(produto);
            produto = new ProdutoClasse();

            System.out.println("\n Deseja adicionar mais produtos? \n  1-Sim\n  0-Não\n");
            opcao = leitor.nextInt();

        } else {
            System.out.println("Operação cancelada");


        }
        System.out.println("Lista de Produtos");
        controllerProduto.listaProduto();
        System.out.format("Total a pagar R$ %.2f \n", ControllerProduto.soma());
        System.out.println("========================");
    }
}

