package primeiraLista;

import java.util.Scanner;

public class Ex05 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex05 test = new Ex05();

        System.out.println("Digite seu salario para descobrir quanto vai ficar com o reajuste de 7%:");
        double salary = scanner.nextDouble();
        System.out.printf("\nSeu salario antes do reajuste: %.2f", salary);
        double salaryAfter = test.salaryReajusted(salary);
        System.out.printf("\nSeu salario depois do reajuste: %.2f", salaryAfter);
    }

    public double salaryReajusted(double value) {
        double rejust = value * 0.07;
        return value + rejust;
    }
}
