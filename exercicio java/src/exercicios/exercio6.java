package exercicios;

import java.util.Scanner;

public class exercio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String genero = "";

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        // Loop para validar o gênero e evitar erros de digitação
        while (true) {
            System.out.print("Digite o gênero (M para Masculino / F para Feminino): ");
            genero = entrada.next().toUpperCase(); // Transforma a entrada em MAIÚSCULO

            if (genero.equals("M") || genero.equals("F")) {
                break; // Sai do loop se a entrada for válida
            } else {
                System.out.println("Opção inválida! Por favor, digite apenas M ou F.");
            }
        }

        int anosFaltam = 0;

        // Lógica de aposentadoria
        if (genero.equals("M")) {
            if (idade < 65) {
                anosFaltam = 65 - idade;
                System.out.println("\nOlá " + nome + ". Faltam " + anosFaltam + " anos para sua aposentadoria (65 anos).");
            } else {
                System.out.println("\nOlá " + nome + ". Você já tem idade para se aposentar!");
            }
        } else { // Se não é M, só pode ser F por causa do loop anterior
            if (idade < 60) {
                anosFaltam = 60 - idade;
                System.out.println("\nOlá " + nome + ". Faltam " + anosFaltam + " anos para sua aposentadoria (60 anos).");
            } else {
                System.out.println("\nOlá " + nome + ". Você já tem idade para se aposentar!");
            }
        }

        entrada.close();
    }
}