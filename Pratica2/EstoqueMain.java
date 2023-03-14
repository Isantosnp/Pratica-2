package Pratica2;

import java.util.Scanner;

public class EstoqueMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidadeMinima, quantidadeAtual;
        Estoque estoque = new Estoque();
        System.out.println("Informe o nome");
       String nome = teclado.nextLine();
        estoque.setNome(nome);
        System.out.println("Informe a quantidade minima permitida :");
        quantidadeMinima = teclado.nextInt();
        estoque.setQtdMinima(quantidadeMinima);
        System.out.println("Informe a quantidade Atual");
        quantidadeAtual = teclado.nextInt();
        estoque.setQtdAtual(quantidadeAtual);

        estoque.darBaixa(quantidadeAtual);
        estoque.mostra();
        estoque.precisaRepor();

    }
}
