package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        ProdutoClasse produto = new ProdutoClasse();
        ControllerProduto controllerProduto = new ControllerProduto();

        int codigo = 0;
        int valor = 0;
        int quantidade = 0;
        double ipi = 0d;

        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Pressione 1 para adicionar o produto a lista ou outro número para cancelar: ");
        opcao = leitor.nextInt();

        while (opcao == 1)
            switch (opcao) {
                case 1:

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
                break;

                default:
                    System.out.println("Operação cancelada");
                    break;

            }
        System.out.println("Lista de Produtos");
        controllerProduto.listaProduto();
        System.out.println(String.format("Total a pagar R$ %.2f",controllerProduto.soma()));
        System.out.println("========================");
        }
    }

