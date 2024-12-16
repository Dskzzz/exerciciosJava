// Define o pacote do projeto. Pacotes são usados para organizar classes em Java.
package javaComOJapa;

// Define a classe. Em Java, todo o código deve estar dentro de uma classe.
public class mostrarNoTerminal {

    // Método principal. É o ponto de entrada do programa.
    public static void main(String[] args) {
        
        // Declaração de uma variável inteira (números inteiros).
        int numero = 5;
        
        // Declaração de uma variável de texto (String) para armazenar palavras ou frases.
        String nome = "Japa";
        
        // Declaração de uma variável de ponto flutuante (float) para números com casas decimais.
        // O 'f' no final indica que é um valor do tipo float.
        float altura = 1.80f;
        
        // Exibe uma mensagem formatada no console. 
        // %s é usado como um marcador para uma String (texto) que será substituído pelo valor da variável.
        System.out.printf("O nome dele e: %s %n", nome);

        // Exibe uma mensagem formatada no console.
        // %.2f é um marcador para um número float com duas casas decimais.
        System.out.printf("Ele tem essa altura: %.2f %n", altura);

        // Exibe uma mensagem formatada no console.
        // Aqui, usamos %s para converter o número inteiro em texto.
        System.out.printf("Ele tem esses centimetros de pika: %s %n", numero);
    }
}

