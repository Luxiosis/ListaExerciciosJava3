import java.util.Scanner;

public class ExercicioDesafio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número:");
        int numero = sc.nextInt();
        System.out.println("O número informado foi " + numero);
        System.out.println("Os números primos entre 1 e " + numero + " são:");
        System.out.println("1");

        for (int x = 1; x <= numero; x++) {
            if (x == 1 || x == 0) {
                continue;
            }
            int checado = 1;
            for (int y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    checado = 0;
                    break;
                }
            }
            if (checado == 1) {
                System.out.printf("%d\n", x);
            }
        }
    }
}
