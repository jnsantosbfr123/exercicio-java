package exercicios;

import java.util.Scanner;

public class exercio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do jogador: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = entrada.nextInt();

        // Considerando o ano atual como 2024 (você pode ajustar se preferir)
        int anoAtual = 2024;
        int idade = anoAtual - anoNascimento;

        System.out.println("\n--- Resultado da Classificação ---");
        System.out.println("Jogador: " + nome);
        System.out.println("Idade: " + idade + " anos");

        // Lógica de classificação usando else if
        if (idade >= 6 && idade <= 12) {
            System.out.println("Categoria: Infantil");
        }
        else if (idade >= 13 && idade <= 17) {
            System.out.println("Categoria: Sub17");
        }
        else if (idade >= 18) {
            System.out.println("Categoria: Adulto");
        }
        else {
            System.out.println("Categoria: Idade não permitida para as categorias atuais.");
        }

        entrada.close();
    }
}