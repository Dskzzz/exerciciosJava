package javaComOJapa;

import java.util.Scanner;
public class pedir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");

        String nome = scanner.nextLine();
        System.out.printf("Seu nome e: %s", nome);

        scanner.close();
    }
}
