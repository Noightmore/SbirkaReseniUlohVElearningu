package main;

import java.util.Locale;
import java.util.Scanner;

public class VypisRealneCislo {

        static Locale loc = new Locale ("CS", "cz");
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] arg) {
            sc.useLocale(loc);
            double num = sc.nextDouble();
            System.out.format(loc, "%10.3f", num);
        }
}



