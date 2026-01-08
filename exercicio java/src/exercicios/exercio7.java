package exercicios;

import java.util.Scanner;

public class exercio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String genero = "";

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Em que ano você começou a trabalhar? ");
        int anoInicio = entrada.nextInt();

        // Consideramos o ano de 2024 para o cálculo
        int anoAtual = 2024;
        int anosTrabalhados = anoAtual - anoInicio;

        // Validação do gênero
        while (true) {
            System.out.print("Digite o gênero (M para Masculino / F para Feminino): ");
            genero = entrada.next().toUpperCase();

            if (genero.equals("M") || genero.equals("F")) {
                break;
            } else {
                System.out.println("Erro: Digite apenas M ou F.");
            }
        }

        System.out.println("\n--- Resumo de Contribuição ---");
        System.out.println("Nome: " + nome);
        System.out.println("Tempo trabalhado: " + anosTrabalhados + " anos");

        // Lógica de tempo de serviço
        if (genero.equals("M")) {
            if (anosTrabalhados >= 35) {
                System.out.println("Situação: Já pode se aposentar por tempo de serviço!");
            } else {
                int falta = 35 - anosTrabalhados;
                System.out.println("Situação: Faltam " + falta + " anos de contribuição.");
            }
        } else { // Caso Feminino
            if (anosTrabalhados >= 30) {
                System.out.println("Situação: Já pode se aposentar por tempo de serviço!");
            } else {
                int falta = 30 - anosTrabalhados;
                System.out.println("Situação: Faltam " + falta + " anos de contribuição.");
            }
        }

        entrada.close();
    }
}