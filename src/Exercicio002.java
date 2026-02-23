/*
 * Exercício 002 - Classificação de Idade
 *
 * Descrição: Este programa solicita o nome e a idade do usuário e realiza a classificação da faixa etária utilizando estruturas condicionais.
 * O sistema classifica em: Criança; Adolescente; Adulto; Idoso e idade inválida (caso seja menor que 0).
 * Além disso, verifica regras específicas: Se for adolescente com 16 anos ou mais, informa que já pode votar. Se for adulto, informa que pode dirigir e deve votar.
 *
 * Conceitos treinados:
 * - Estruturas condicionais (if, else if, else)
 * - Operadores relacionais (>, >=, <=)
 * - Operadores lógicos (&&)
 * - Encadeamento de condições
 * - Condição aninhada
 * - Entrada de dados com Scanner
 * - Boas práticas (fechamento do Scanner)
 *
 * Objetivo:
 * Reforçar a lógica de decisão e organização de fluxo condicional em Java.
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
        } else if (idade >= 59 ) {
            System.out.println(nome + " é um idoso.");
        } else {
            System.out.println("Idade inválida.");
        }

        scanner.close();

    }
}
