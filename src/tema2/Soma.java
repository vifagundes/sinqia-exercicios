package tema2;
import java.util.Scanner;
/*
Enunciado
Criar um programa que recebe 2 números e realiza a soma deles. Porém, nesse caso o programa
deve observar quantos parâmetros são enviados via terminal(args).

Se for nenhum, deve pedir via System.in que o usuário digite 2 números. No caso de vir apenas 1,
deve pedir outro parâmetro via System.in.
Se for 2, deve realizar a soma dos dois.

No caso de qualquer outra quantidade. Deve apresentar uma mensagem de erro falando que a quantidade é inválida.
*/

public class Soma {
    public static void main(String[] args) {
        Soma test = new Soma();
        int num1;
        int num2;
        int arraySize = args.length;
        System.out.println("Soma de dois numeros...");

        if(arraySize == 0) {
            num1 = test.askNumbersToSum();
            num2 = test.askNumbersToSum();
            test.sumPrint(num1,num2);
        } else if (arraySize == 1) {
            num1 = Integer.parseInt(args[0]);
            num2 = test.askNumbersToSum();
            test.sumPrint(num1,num2);
        } else if(arraySize == 2) {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            test.sumPrint(num1,num2);
        } else {
            System.out.println("ERRO!, RODE O PROGRAMA DE NOVO USANDO DOIS NUMEROS!!!");
        }
    }

    public void sumPrint(int num1, int num2) {
        int result = num1 + num2;
        System.out.printf("\nRESULTADO: %d + %d = %d", num1, num2, result);
    }

    public int askNumbersToSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nDIGITE O NUMERO: ");
        int num = scanner.nextInt();
        return num;
    }
}