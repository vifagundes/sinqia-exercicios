package primeiraLista;

import java.util.Scanner;

public class Ex07 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex07 ex07 = new Ex07();
        System.out.println("Digite dois valores: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        ex07.operations(firstNumber,secondNumber);

    }

    public void operations(int value1, int value2) {
        System.out.printf("\n %d + %d = %d", value1, value2, (value1+value2));
        System.out.printf("\n %d - %d = %d", value1, value2, (value1-value2));
        System.out.printf("\n %d * %d = %d", value1, value2, (value1*value2));
        System.out.printf("\n %d / %d = %.2f", value1, value2, ((double)value1/value2));
    }
}
