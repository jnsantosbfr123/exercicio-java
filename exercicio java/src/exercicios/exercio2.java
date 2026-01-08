package exercicios;

import java.util.Scanner;

public class exercio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num = 0;
        boolean entradaValida = false;


        while (!entradaValida) {
            System.out.print("Digite um número inteiro maior que zero: ");

            if (entrada.hasNextInt()) {
                num = entrada.nextInt();


                if (num > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("O número deve ser positivo e maior que zero \n");
                }
            } else {

                System.out.println("Entrada inválida. Digite apenas números inteiros.\n");
                entrada.next();
            }
        }

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");
        }

        entrada.close();
    }

}

