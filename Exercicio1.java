import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu número:");
        int numero = sc.nextInt();

        System.out.println("O número recebido foi " + numero);
        for (int i = 1; i<= numero; i++) {
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
}
