import java.util.Scanner;
import java.util.Random;

public class Exercicio3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número:");
        int numero = sc.nextInt();
        System.out.println("O número recebido foi " + numero);

        int soma=0;
        Random r = new Random();
        for(int i=0; i<numero; i++){
            int aleatorio = r.nextInt(7);
            if (aleatorio == 0) {
                aleatorio++;
            }
            System.out.println("O número "+ aleatorio+" foi sorteado!");
            soma += aleatorio;
        }

        System.out.println("A soma dos números sorteados é " + soma);
    }
}
