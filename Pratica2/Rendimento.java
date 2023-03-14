package Pratica2;

public class Rendimento {
    private double investimentoInicial;
    private double taxaFixa;
    private int numMeses;
    private double  investimento;

    public Rendimento(double investimentoInicial, double taxaFixa, int numMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaFixa = taxaFixa;
        this.numMeses = numMeses;
    }
    public double getInvestimentoInicial() {
        return investimentoInicial;
    }
    public void setInvestimentoInicial(double investimentoInicial) {
        this.investimentoInicial = investimentoInicial;
    }
    public double getTaxaFixa() {
        return taxaFixa;
    }

    public void setTaxaFixa(double taxaFixa) {
        this.taxaFixa = taxaFixa;
    }
    public int getNumMeses() {
        return numMeses;
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public double calcInvestimento(){
       return investimento = (investimentoInicial * numMeses);
    }
    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }
}

