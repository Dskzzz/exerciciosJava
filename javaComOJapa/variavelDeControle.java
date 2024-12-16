package javaComOJapa;
import java.util.Scanner;
public class variavelDeControle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite Sua Nota 1");
        float nota1 = scanner.nextInt();

        System.out.print("didgite sua nota 2: ");
        float nota2 = scanner.nextInt();

        float media = (nota1 + nota2) / 2;
        if (media <= 4) {
            System.out.printf("Você perdeu, otário!, sua média foi: %.1f", media);
        }else if(media <= 6){
            System.out.printf("Tá de recuperção, seu pau no cu! sua média foi: %.1f", media);
        }else if(media > 6){
            System.out.printf("Você passou, porra! sua média foi: %.1f", media);
        }   

        scanner.close();
    }
}
