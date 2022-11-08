package primeiraLista;

public class Ex03 {
    public double calcJuros (double valor, double tempo){
        return valor * Math.pow((1 + 0.02), tempo);
    }

    public static void main (String[] args) {
        Ex03 ex03 = new Ex03();

        double calc = ex03.calcJuros(1000, 1);
        System.out.println(calc);
    }
}
