package tema2;

public class ParImpar {
    public static void main(String[] args) {
       int    numero     = Integer.parseInt(args[0]);
       String parOuImpar = numero % 2 == 0 ? "Par" : "Impar";
       System.out.printf("O numero %d e %s", numero, parOuImpar);
    }
}