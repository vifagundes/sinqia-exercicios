package segundaLista;

import java.util.Scanner;

public class Ex01 {


    public static void main(String[] args) {

        Ex01 ex01 = new Ex01();
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double media = 0;
        double[] notas;
        notas = new double[3];
        System.out.println("Iforme o nome do aluno(a): ");
        String name = scanner.nextLine();
        System.out.println("Iforme a turma do aluno(a): ");
        String turma = scanner.nextLine();
        System.out.println("Iforme as notas do aluno(a): ");
        notas[0] = scanner.nextDouble();
        notas[1] = scanner.nextDouble();
        notas[2] = scanner.nextDouble();

        for(int i = 0;i< notas.length;i++) {
            soma += notas[i];
            media = soma / 3;
        }
        System.out.printf("\nA media das notas do(a) Aluno(a) %s da turma %s foi de: %.2f", name, turma, media);
    }
}

