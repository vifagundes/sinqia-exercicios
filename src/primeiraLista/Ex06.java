package primeiraLista;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex06 test = new Ex06();

        System.out.println("Digite um valor em reais(R$) para fazer a conversão: ");
        double realValue = scanner.nextDouble();
        double dolarValue = test.getDolar(realValue);
        double euroValue = test.getEuro(realValue);
        double libraValue = test.getLibra(realValue);

        System.out.printf("\nO valor inserido convertido para Dolar: %.2fUS$", dolarValue);
        System.out.printf("\nO valor inserido convertido para Euro: %.2f€", euroValue);
        System.out.printf("\nO valor inserido convertido para Libra: %.2f£", libraValue);
    }

    public double getDolar(double value) { // Valor calculado com o Dolar valendo 5,19 reais
        return value / 5.19;
    }

    public double getEuro(double value) { // Valor calculado com o Euro valendo 5,18 reais
        return value / 5.18;
    }

    public double getLibra(double value) { // Valor calculado com a Libra valendo 5,92 reais
        return value / 5.92;
    }
}
