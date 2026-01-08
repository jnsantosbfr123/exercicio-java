package exercicios;


import java.util.Scanner;

public class exercio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // in = dentro = Entrada / teclado

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a primeira nota: "); // out = fora = saída / monitor
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >=7.0){
            System.out.println("Aluno: " + nome);
            System.out.println("Média: " + media + " - Aprovado" );
        }if (media >= 4 || media < 7 ){
            System.out.println("Aluno: " + nome);
            System.out.println("Média: " + media + " - Recuperação" );
        }else {
            System.out.println("Aluno: " + nome);
            System.out.println("Média: " + media);
            System.out.println("Reprovado" );
        }

        //if (media >= 7.0) {
           // System.out.println("Aluno: " + nome);
           // System.out.println("Média: " + media + " - Aprovado" );
        //} //else {
            //System.out.println("Aluno: " + nome);
           // System.out.println("Média: " + media);
           // System.out.println("Reprovado" );
        //}

    }
}
