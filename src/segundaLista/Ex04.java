package segundaLista;

import java.util.Scanner;

public class Ex04 {
    public static void main (String[] args) {

        Ex04 ex04 = new Ex04();
        String[] praias = new String[5];
        double[] distancias = new double[5];
        for(int i = 0; i < 5;i++){
            praias[i]     = ex04.pedePraia();
            distancias[i] = ex04.pedeDistancia();
        }
        int idxMaior = ex04.calcMaisDistante(distancias);
        double media = ex04.calcMedia(distancias);

        System.out.printf("A praia mais distande com %.1f Km de distancia ate o Hotel é a: %s", distancias[idxMaior], praias[idxMaior]);
        System.out.printf("\nA media entre as distancias é: %.1f Km",media);
        System.out.println();
        ex04.confereDistancia(praias,distancias);

    }


    public String pedePraia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome da praia: ");
        return scanner.nextLine();
    }

    public double pedeDistancia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iforme a distancia da praia em km: ");
        return scanner.nextDouble();
    }

    public int calcMaisDistante(double[] distancias){
        int maior = 0;
        for(int i = 0;i< distancias.length;i++) {
            if(distancias[i] > distancias[maior]) {
                maior = i;
            }
        }
        return maior;
    }

    public void confereDistancia(String[] praias, double[] distancias) {
        String outraPraia;
        double outraDistancia;
        System.out.println("Praias entre 10Km e 15Km");
        for(int i = 0;i< distancias.length;i++){
            if(distancias[i] >= 10.0 & distancias[i] <= 15.0) {
                outraDistancia = distancias[i];
                outraPraia = praias[i];
                System.out.printf("\nNome da praia: %s\nDistancia ate o Hotel: %.1f", outraPraia, outraDistancia);
            }
        }
    }

    public double calcMedia(double[] distancias) {
        double soma = 0.0;
        double media = 0.0;
        for(int i = 0;i< distancias.length;i++){
            soma += distancias[i];
            media = soma / 5;
        }
        return media;
    }
}
