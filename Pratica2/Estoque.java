package Pratica2;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return this.qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde) {
        this.qtdAtual += qtde;
        while (this.qtdAtual < 0) ;
        this.qtdAtual += qtde;
    }

    public String mostra() {
        return "Nome" + this.nome;
    }

    public boolean precisaRepor() {
        if (qtdMinima < qtdAtual) {
            return false;
        } else {
            return true;
        }
    }

}