package Exercicio04;

import java.util.ArrayList;

public class ControllerProduto {
    private static ArrayList<ProdutoClasse> produtos = new ArrayList<ProdutoClasse>();

    public static ArrayList<ProdutoClasse> getProdutos() {
        return produtos;

    }

    public ControllerProduto() {
        this.produtos = produtos;
    }

    public void adicionar(ProdutoClasse item) {

        produtos.add(item);
    }

    public void listaProduto() {
        produtos.forEach((lp) -> {
            System.out.println("========================");
            System.out.println("Código: " + lp.getCodP());
            System.out.println("Valor do produto: " + lp.getValorP());
            System.out.println("Quantidade: " + lp.getQuantidadeP());
            System.out.println("========================");
        });
    }

    static double soma() {
        double total = 0;
        for (ProdutoClasse s : produtos) {
            total+=(s.getValorP()*s.getQuantidadeP())*(s.getIpiP()/100+1);
        };
        return total;
    }
}

