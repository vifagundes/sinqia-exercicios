package tema1;

public class ConverteFahrenheit {
    public static final double fator1 = (double) 9 / 5;
    public static final int    fator2 = 32;

    public static void main(String[] args) {
        ConverteFahrenheit teste = new ConverteFahrenheit();
        teste.convFahrenheit(-4.7);
        teste.convFahrenheit(23.9);
    }

    public void convFahrenheit(double tempCelsius) {
        double resultado = (tempCelsius * fator1) + fator2;
        System.out.printf("%.2f C to %.2f F\n", tempCelsius, resultado);
    }
}
