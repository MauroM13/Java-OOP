import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        String sobreNome;
        String iniciais;
        String dataNascimento;

        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome:");
        sobreNome = scanner.nextLine();
        System.out.println("Digite sua data de nascimento (formato dd/mm/aaaa):");
        dataNascimento = scanner.nextLine();

        iniciais = nome.charAt(0) + "" + sobreNome.charAt(0);

        System.out.println("Seu nome é " + nome + " " + sobreNome + ".");
        System.out.println("Suas iniciais são: " + iniciais + ".");
        System.out.println("Sua data de nascimento é: " + dataNascimento + ".");
    }
}