/*
 * Exercício 002 - Classificação de Idade
 *
 * Solicita nome e idade do usuário e classifica a faixa etária
 * (criança, adolescente, adulto ou idoso), aplicando regras
 * adicionais como permissão para voto e direção.
 *
 * Treino de estruturas condicionais, operadores relacionais e lógicos,
 * encadeamento de decisões e organização do fluxo do programa.
 */

import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println(nome + " é uma criança.");
        } else if (idade <= 17) {
            System.out.println(nome + " é um adolescente.");
            if (idade >= 16 ) {
                System.out.println("E já pode votar.");
            }
        } else if (idade <= 59) {
            System.out.println(nome + " é um adulto. E já pode dirigir e deve votar nas eleições.");
        } else if (idade > 59 ) {
            System.out.println(nome + " é um idoso.");
        } else {
            System.out.println("Idade inválida.");
        }

        scanner.close();

    }
}
