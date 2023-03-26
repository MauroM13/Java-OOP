package Desafio1;

import java.util.Scanner;

public class Primes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para n: ");
        int n = scanner.nextInt();

        int cont = 0;
        int numero = 2;
        System.out.print("Os primeiros " + n + " números primos são: ");
        while (cont < n) {
            if (Prime(numero)) {
                System.out.print(numero + ", ");
                cont++;
            }
            numero++;
        }

        scanner.close();
    }

    public static boolean Prime(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}