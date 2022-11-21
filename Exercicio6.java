import java.util.Scanner;
import java.io.*;

public class Exercicio6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = sc.nextLine();
        System.out.println("Digite uma letra:");
        String letra = sc.nextLine();
        boolean aceitar = true;

        if (letra.length() > 1) {
            System.out.printf("Erro: Você informou \"%s\" e \"%s\". Deve-se informar uma única " +
                    "letra para que o programa contabilize as ocorrências em \"%s\".",palavra, letra, palavra);
            aceitar = false;
        }
        char letra_escolhida = letra.charAt(0);

        int vezes = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letra_da_palavra = palavra.charAt(i);
            if (letra_da_palavra == letra_escolhida) {
                vezes++;
            }
        }

        if (vezes > 0 && aceitar == true) {
            System.out.printf("Existem %d ocorrências da letra \"%c\" na palavra \"%s\".\n", vezes, letra_escolhida, palavra);
        } else if (vezes == 0 && aceitar == true) {
            System.out.printf("Não existem ocorrências da letra \"%c\" na palavra \"%s\".", letra_escolhida, palavra);
        }

    }
}
