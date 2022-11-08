package primeiraLista;

import java.util.Scanner;

public class Ex04 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex04 test = new Ex04();
        System.out.println("Digite sua idade para descobrir quantos dias voce ja viveu: ");
        int age = scanner.nextInt();
        System.out.printf("\n Voce viveu %d dias", test.getDays(age));
    }
    public int getDays(int age) {
        int totalDaysWithoutLeapYear;
        int leapYear  =  365 * 4;
        int leapYearExtraDays;
        totalDaysWithoutLeapYear = age * 365;
        leapYearExtraDays = totalDaysWithoutLeapYear / leapYear;
        return totalDaysWithoutLeapYear + leapYearExtraDays;
    }
}
