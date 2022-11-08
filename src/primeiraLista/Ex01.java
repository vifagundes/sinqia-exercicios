package primeiraLista;

public class Ex01 {

    public double conversaoKelvin(double temperatura) {
        return temperatura + 273.15;
    }

    public double conversaoFahrenheit(double temperatura) {
        return (temperatura * 1.8) + 32;
    }

    public double conversaoReaumur(double temperatura) {
        return temperatura * 0.8;
    }

    public double conversaoRankine(double temperatura) {
        return (temperatura * 1.8) + 32 + 459.67;
    }

    public static void main(String[] args) {

        double temperatura = 0;

        Ex01 ex01 = new Ex01();
        double tempKelvin = ex01.conversaoKelvin(temperatura);
        double tempFahrenheit = ex01.conversaoFahrenheit(temperatura);
        double tempReaumur = ex01.conversaoReaumur(temperatura);
        double tempRankine = ex01.conversaoRankine(temperatura);

        System.out.println("Temperatura em celsius: " + temperatura);
        System.out.println("Temperatura convertida de celsius para Kelvin: " + tempKelvin);
        System.out.println("Temperatura convertida de celsius para Fahrenheit: " + tempFahrenheit);
        System.out.println("Temperatura convertida de celsius para Rankine: " + tempRankine);
        System.out.println("Temperatura convertida de celsius para Reaumur: " + tempReaumur);

    }
}