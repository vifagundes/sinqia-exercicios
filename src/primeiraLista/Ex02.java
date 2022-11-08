package primeiraLista;

public class Ex02 {


    public double calcCavalos(double massa, double altura, double segundos) {
        return (massa * altura / segundos) / 745.6999;
    }

    public static void main(String[] args) {

        Ex02 ex02 = new Ex02();
        double cavalos = ex02.calcCavalos(5,2,60);

        System.out.println(cavalos);
    }
}
