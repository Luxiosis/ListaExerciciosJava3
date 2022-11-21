import java.util.Random;
import java.util.Scanner;

public class ExercicioDesafio2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de dados que você quer lançar:");
        int dados_qnt = sc.nextInt();
        System.out.println("Digite a quantidade de vezes que eles irão ser sorteados:");
        int dados_vzs = sc.nextInt();
        Random aleatorio = new Random();

        System.out.printf("Serão lançados %d dados por %d vezes:\n", dados_qnt, dados_vzs);

        for(int i = 0; i < dados_vzs; i++) {
            int soma = 0;
            for(int j = 0; j < dados_qnt; j++) {
                int igual = j + 1;
                int numero = aleatorio.nextInt(7);
                if (numero < 1) {
                    numero++;
                }
                if (igual == dados_qnt) {
                    System.out.printf("%d = ", numero);
                } else if (j < dados_qnt) {
                    System.out.printf("%d + ", numero);
                }
                soma = soma + numero;
            }
            System.out.printf("%d\n", soma);
        }
    }
}
