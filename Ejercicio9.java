import java.util.Scanner;

public class Ejercicio9 {
    Dia[] dias;
    Scanner scanner;

    public Ejercicio9() {
        dias = new Dia[5];
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Temperatura minima dias [" + i + "] ");
            double minima = scanner.nextDouble();

            System.out.println("Temperatura maxima dias [" + i + "] ");
            double maxima = scanner.nextDouble();

            double media = (minima + maxima) / 2.0;

            Dia dia = new Dia(minima, maxima, media);
            dias[i] = dia;
        }

        System.out.println("\nTemperaturas Medias: ");
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Temperatura media dias [" + i + "] " + dias[i].getTemperatruraMedia());
        }

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias.length - 1 - i; j++) {
                if (dias[j].getTemperaturaMinima() > dias[j + 1].getTemperaturaMinima()) {
                    Dia auxiliar = dias[j];
                    dias[j] = dias[j + 1];
                    dias[j + 1] = auxiliar;
                }
            }
        }
        System.out.println("\nTemperaturas Minimas: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("Temperatura minima dias [" + i + "] " + dias[i].getTemperaturaMinima());
        }
        System.out.println("\n Introduzca una temperatura");
        double temperatura = scanner.nextDouble();
        int contador=0;
        for (int i = 0; i < dias.length; i++) {
            if (temperatura == dias[i].getTemperaturaMaxima()) {
                System.out.println(dias[i]);

                contador++;
            }
        }
        if (contador==0) {
            System.out.println("No existe ninguna temperatura maxima que coincida con la temperatura ingresada.");
        }
    }
}