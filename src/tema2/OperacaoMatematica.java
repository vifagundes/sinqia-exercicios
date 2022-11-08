package tema2;

import java.util.Scanner;

public class OperacaoMatematica {
    public static void main(String[] args){
        OperacaoMatematica test = new OperacaoMatematica();
        double num1;
        double num2;
        double result = 0;

        int operator = test.greetings();
        if (operator < 1 || operator > 4) {
            System.out.println("ERRO!!, OPERACAO MATEMATICA ERRADA");
        } else {
            num1 = test.askNumbers();
            num2 = test.askNumbers();
            result = test.calc(operator, num1, num2);
            System.out.println(result);
        }
    }

    public int greetings() {
        Scanner scanner = new Scanner(System.in);
        String operations[] = {"+ (adicao)", "- (subtracao)", "* (multiplicacao)", "/ (divisao)"};
        int numbers[] = {1, 2, 3, 4};

        for (int i = 0; i < operations.length; i++) {
            System.out.printf("\n%d . %s\n", numbers[i], operations[i]);
        }

        System.out.println("ESCOLHA A OPERACAO MATEMATICA DESEJADA:");
        int operator = scanner.nextInt();
        return operator;
    }

    public double askNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nDIGITE O NUMERO: ");
        double num = sc.nextDouble();
        return num;
    }

    public double calc(int operator, double num1, double num2) {
       if(operator == 1) {
           return num1 + num2;
       } else if (operator == 2){
           return num1 - num2;
       } else if (operator == 3) {
           return num1 * num2;
       } else if (operator == 4) {
           return num1 / num2;
       } else {
           return 0;
       }
    }
}
