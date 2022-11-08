package segundaLista;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Ex06 ex06 = new Ex06();
        int[] numbers = new int[4];
        for(int i = 0; i < numbers.length;i++) {
            numbers[i] = ex06.getNumbers();
        }
        int result = ex06.calc(numbers);
        System.out.println(result);
    }

    public int getNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero: ");
        return scanner.nextInt();
    }

    public int calc(int[] numbers) {
        int calc = 0;
        for(int i = 0; i <numbers.length; i++){
            calc += Math.pow(numbers[i], 2);
        }
        return calc;
    }
}
