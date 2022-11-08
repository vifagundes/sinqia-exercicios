package segundaLista;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Digite seu edereco: ");
        String addres = scanner.nextLine();
        System.out.println("Digite seu CEP: ");
        String cep = scanner.nextLine();
        System.out.println("Digite seu telefone: ");
        String phone = scanner.nextLine();

        System.out.println(name);
        System.out.println(addres);
        System.out.printf("%s %s",cep, phone);
    }
}
