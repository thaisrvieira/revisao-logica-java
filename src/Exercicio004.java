/*
 * Exercício 004 - Uso do do while
 * Solicita uma senha e repete a leitura até que o valor correto seja informado.
 * Treino de repetição, validação de dados e escopo de variável.
 */

import java.util.Scanner;

public class Exercicio004 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int senha = 1234;
        int senhaDigitada;

        do {
            System.out.println("Informe a sua senha");
            senhaDigitada = scanner.nextInt();

        } while (senhaDigitada != senha);

        System.out.println("Acesso permitido.");

        scanner.close();

    }

}
