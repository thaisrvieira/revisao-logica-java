/*
 * Exercício 005 - Uso do for
 * Exibe a tabuada de um número de 1 até 10.
 * Treino de estrutura for, contador e multiplicação.
 */

import java.util.Scanner;

public class Exercicio005 {

    public static void main(String[] args) {

        int tabuada;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int contador = 1; contador <= 10; contador++){
            tabuada = numero * contador;
            System.out.println(numero + " x " + contador + " = " + tabuada);

        }

        scanner.close();

    }
}
