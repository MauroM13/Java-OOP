package Desafio2;

import java.util.Scanner;

public class PedraPapelTesoura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta o nome dos jogadores
        System.out.print("Digite o nome do primeiro jogador: ");
        String player1 = scanner.nextLine();
        System.out.print("Digite o nome do segundo jogador: ");
        String player2 = scanner.nextLine();

        int pontuacao1 = 0;
        int pontuacao2 = 0;
        String jogada1, jogada2;

        // GameLoop
        while (true) {
            // Pergunta a jogada do jogador 1
            System.out.print(player1 + ", escolha pedra, papel ou tesoura (ou * para sair): ");
            jogada1 = scanner.nextLine();
            if (jogada1.equals("*")) {
                break;
            }

            // Pergunta a jogada do jogador 2
            System.out.print(player2 + ", escolha pedra, papel ou tesoura: ");
            jogada2 = scanner.nextLine();

            int resultado = whichWin(jogada1, jogada2);
            if (resultado == 0) {
                System.out.println("Empate!");
            } else if (resultado == 1) {
                System.out.println(player1 + " ganhou!");
                pontuacao1++;
            } else {
                System.out.println(player2 + " ganhou!");
                pontuacao2++;
            }

            System.out.println("Placar: " + player1 + " " + pontuacao1 + " x " + pontuacao2 + " " + player2);
        }

        scanner.close();
    }

    // Função para verificar quem ganhou
    public static int whichWin(String jogada1, String jogada2) {
        if (jogada1.equals(jogada2)) {
            return 0; // empate
        } else if (jogada1.equals("pedra") && jogada2.equals("tesoura")
                || jogada1.equals("papel") && jogada2.equals("pedra")
                || jogada1.equals("tesoura") && jogada2.equals("papel")) {
            return 1; // jogador 1 ganhou
        } else {
            return 2; // jogador 2 ganhou
        }
    }
}