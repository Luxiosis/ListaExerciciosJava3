import java.util.Scanner;
import java.util.Random;

public class Exercicio5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número:");
        int numero = sc.nextInt();
        System.out.println("O número informado foi " + numero);
        boolean acerto = false;
        int contagem = 0;

        if (numero > 6 || numero < 1) {
            System.out.println("ERRO! Digite número inteiro maior que 0 ou menor que 7!");
        } else {
            while (acerto == false) {
                Random random = new Random();
                int aleatorio = random.nextInt(7);
                if (aleatorio == numero) {
                    System.out.println("Foi sorteado o número " + aleatorio);
                    contagem++;
                    acerto = true;
                }
                else {
                    System.out.println("Foi sorteado o número " + aleatorio);
                    contagem++;
                }
            }

            System.out.printf("Foram necessários %d sorteios para que o número %d fosse sorteado.", contagem, numero);
        }

    }
}
