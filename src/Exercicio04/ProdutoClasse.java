package Exercicio04;

public class ProdutoClasse {

    private int codP;
    private double valorP;
    private  int quantidadeP;
    private double ipiP;

    public ProdutoClasse(int codP, int valorP, int quantidadeP, double ipi) {
        this.codP = codP;
        this.valorP = valorP;
        this.quantidadeP = quantidadeP;
        this.ipiP = ipiP;
    }

    public ProdutoClasse() {

    }

    public int getCodP() {
        return codP;
    }

    public void setCodP(int codP) {
        this.codP = codP;
    }

    public double getValorP() {
        return valorP;
    }

    public void setValorP(int valorP) {
        this.valorP = valorP;
    }

    public int getQuantidadeP() {
        return quantidadeP;
    }

    public void setQuantidadeP(int quantidadeP) {
        this.quantidadeP = quantidadeP;
    }

    public double getIpiP(){return ipiP;}

    public void setIpiP(double ipiP){this.ipiP = ipiP;}


}
