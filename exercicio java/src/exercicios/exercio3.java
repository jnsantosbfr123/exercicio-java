package exercicios;

import java.util.Scanner;

public class exercio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: "); // Corrigi o texto para "segunda"
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("\n--- Resultado ---");
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);

        // Lógica correta de encadeamento:
        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 4.0) {
            // Se chegou aqui, é porque a média é menor que 7
            System.out.println("Situação: Recuperação");
        } else {
            // Se não é >= 7 nem >= 4, só pode ser menor que 4
            System.out.println("Situação: Reprovado");
        }

        entrada.close(); // Sempre bom fechar o scanner
    }
}