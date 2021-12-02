package main;

import java.util.Locale;
import java.util.Scanner;

public class PrumernaDenniTeplota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float prumernaTeplota;
        float t1 = sc.nextFloat();
        float t2 = sc.nextFloat();
        float t3 = sc.nextFloat();

        prumernaTeplota = (t1+t2+t3+t3)/4;

        System.out.format(Locale.US, "%1.2f", prumernaTeplota);
    }
}
