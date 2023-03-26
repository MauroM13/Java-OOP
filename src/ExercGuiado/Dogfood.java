package ExercGuiado;

import java.util.Scanner;

public class Dogfood {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cachorro: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de comida que o cachorro come (em kg por dia): ");
        float quantidadeDiaria = scanner.nextFloat();

        int quantosPacotes = quantosPacotes(quantidadeDiaria);

        System.out.println("O cachorro " + nome + " precisa de " + quantosPacotes + " pacotes por dia.");

        double totalPeso = 0;
        for (int i = 1; i <= quantosPacotes; i++) {
            System.out.print("Digite o peso do pacote " + i + ": ");
            float peso = scanner.nextFloat();
            totalPeso += peso;
        }

        System.out.println("O cachorro " + nome + " precisa de " + totalPeso + " kg de comida por dia.");

        scanner.close();
    }

    public static int quantosPacotes(double quantidadeDiaria) {
        final double PESO_MINIMO_POR_DIA = 3.0;
        return (int) Math.ceil(quantidadeDiaria / PESO_MINIMO_POR_DIA);
    }

}