import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]) {

        double[] precos = {4.50, 3.10, 2.00};
        String[] nomes = {"bolacha", "refrigerante", "água"};

        for (int i = 0; i < precos.length; i++) {
            double valor = precos[i];
            String produto = nomes[i];
            System.out.printf("Foi informado o produto \"%s\" que custa R$ %.2f.\n", produto, valor);
        }
        double maior = precos[0];
        String vencedor = nomes[0];
        for (int counter = 1; counter < precos.length; counter++) {
            if (precos[counter] > maior) {
                vencedor = nomes[counter];
            }
        }
        System.out.printf("O produto mais caro é a \"%s.\" \n", vencedor);

    }
}
