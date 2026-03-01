/*
 * Exercício 003 - Uso do while
 * Soma números digitados pelo usuário até que 0 seja informado.
 * Treino de laço de repetição, condição de parada e atualização de variável.
 */

import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        int soma = 0;

        while (numero !=0) {
            soma += numero;
            System.out.println("Digite outro numero: ");
            numero = scanner.nextInt();
        }

        System.out.println("A soma dos numeros é: " + soma);

        scanner.close();

    }

}
