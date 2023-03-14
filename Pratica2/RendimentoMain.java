package Pratica2;

import java.util.Scanner;

public class RendimentoMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Rendimento rendimento = new Rendimento(1.500,9.53, 8);
        System.out.println("O investimento foi de :" +rendimento.calcInvestimento());
        teclado.close();
    }
}
