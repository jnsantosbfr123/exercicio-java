package exercicios;

import java.util.Scanner;

public class exercio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o salário atual: ");
        double salarioAtual = entrada.nextDouble();

        System.out.print("Digite o percentual de aumento (ex: 10 para 10%): ");
        double percentual = entrada.nextDouble();

        // Cálculo: Salário + (Salário * (Percentual / 100))
        double aumento = salarioAtual * (percentual / 100);
        double novoSalario = salarioAtual + aumento;

        System.out.println("\n--- Atualização Salarial ---");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Antigo: R$ " + salarioAtual);
        System.out.println("Aumento: R$ " + aumento);
        System.out.println("Novo Salário: R$ " + novoSalario);

        entrada.close();
    }
}