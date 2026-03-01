/*
 * Exercício 006 - Calculadora Simples
 * Realiza operações básicas (+, -, *, /) utilizando switch.
 * Treino de controle de fluxo, operadores aritméticos e validação de entrada.
 */

import java.util.Scanner;

public class Exercicio006 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO NÚMERO");
        double numero1 = scanner.nextDouble();

        System.out.println("DIGITE O SEGUNDO NÚMERO");
        double numero2 = scanner.nextDouble();

        System.out.println("DIGITE A OPERAÇÃO: + - * /");
        char operacao = scanner.next().charAt(0);

        double resultado;

        switch (operacao) {

            case '+':
                resultado = numero1 + numero2;

                break;

            case '-':
                resultado = numero1 - numero2;

                break;

            case '*':
                resultado = numero1 * numero2;

                break;

            case '/':
                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                resultado = numero1 / numero2;

                break;

            default:
                System.out.println("OPERAÇÃO INVÁLIDA! SELECIONE UMA OPÇÃO VÁLIDA.");

                return;

        }

        System.out.println("O RESULTADO É: " + resultado);

        scanner.close();

    }

}
