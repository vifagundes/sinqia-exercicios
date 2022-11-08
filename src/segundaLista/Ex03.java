package segundaLista;

public class Ex03 {
    public static void main (String[] args) {
        String[] nomes = {"Aline  ", "Mario  ", "Sergio ", "Shirley"};
        double[] notas = {9.0,10.0,4.5,7.0};
        System.out.println("ALUNO(a)     NOTAS");
        System.out.println("========     =====");

        for(int i = 0; i < notas.length; i++) {
            if(!(notas[i] == 10.0)) {
                System.out.println(nomes[i] + "       " + notas[i]);
            } else {
                System.out.printf("%s       DEZ\n", nomes[i]);
            }
        }

    }
}
