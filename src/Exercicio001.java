/* Exercicio 001
*
* Utilização de operadores aritméticos, entrada e saída de dados e concatenação de variáveis.
*
* */

import java.util.Scanner;

public class Exercicio001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        int tamanhoNome = nome.length();
        int idadeFutura = idade + 10;

        System.out.println(nome + ", seu nome possui: " + tamanhoNome + " caracteres");
        System.out.println("Hoje você tem " + idade + ", mas daqui a 10 anos você terá " + idadeFutura);

        scanner.close();

    }
}
