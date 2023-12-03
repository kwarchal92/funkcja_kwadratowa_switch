package funkcja_kwadratowa_switch;

import java.io.*;
public class FunkcjaKwadratowa {

    public static void main(String[] args)
        throws IOException

    {
        double a, b, c, delta, x1, x2;
        char liczba_pierwiastkow = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program liczy pierwiastki funkcji ax^2 + bx + c = 0");
        System.out.println("Podaj a");
        a = Double.parseDouble(br.readLine());

        if (a == 0)
        {
            System.out.println("Nie dozwolona wartosc wspolczynnika a");
        }
        else
        {
            System.out.println("Podaj b");
            b = Double.parseDouble(br.readLine());
            System.out.println("podaj c");
            c = Double.parseDouble(br.readLine());

            delta = b * b - 4 * a * c;

            if (delta < 0) liczba_pierwiastkow = 0;
            if (delta == 0) liczba_pierwiastkow = 1;
            if (delta > 0) liczba_pierwiastkow = 2;

            switch (liczba_pierwiastkow) {
                case 0:
                    System.out.println("brak pierwiastkw rzeczywistych");
                    break;
                case 1: {
                    x1 = -b / (2 * a);
                    System.out.printf("Dla a = " + "%4.2f, ", a);
                    System.out.printf("Dla b = " + "%4.2f, ", b);
                    System.out.printf("Dla c = " + "%4.2f, ", c);
                    System.out.print("trojmian ma jeden pierwiastek");
                    System.out.printf("%4.2f.", x1);
                }
                break;
                case 2: {
                    x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.printf("Dla a = " + "%4.2f, ", a);
                    System.out.printf("Dla b = " + "%4.2f, ", b);
                    System.out.printf("Dla c = " + "%4.2f, ", c);
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f, ", x1);
                    System.out.print("x2 = ");
                    System.out.printf("%4.2f. ", x2);

                }
                break;

            }
        }
    }
}
