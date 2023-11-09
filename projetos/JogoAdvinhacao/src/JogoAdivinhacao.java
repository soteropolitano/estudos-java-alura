import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        int tentativas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo de Adivinhação! Tente adivinhar o número entre 0 e 100.");

        while (tentativas < 5) {
            System.out.print("Tentativa " + (tentativas + 1) + ": Digite o seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite < 0 || palpite > 100) {
                System.out.println("Por favor, digite um número entre 0 e 100.");
                continue;
            }

            if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número corretamente em " + tentativas + " tentativas.");
                break;
            }
        }

        if (tentativas == 5) {
            System.out.println("Suas 5 tentativas acabaram. O número correto era: " + numeroAleatorio);
        }

        scanner.close();
    }
}
