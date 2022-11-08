package primeiraLista;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex08 ex08 = new Ex08();

        System.out.println("Digite a distancia em Km: ");
        double kmDistance = scanner.nextDouble();
        System.out.println("Digite a quantidade de Gasolina gasta em Litros: ");
        double gas = scanner.nextDouble();
        double gasPerKm = kmDistance / gas;
        System.out.printf("Seu carro faz: %.2f Km/L", gasPerKm);
    }
}
