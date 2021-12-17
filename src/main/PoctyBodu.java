package main;

import java.util.Locale;
import java.util.Scanner;

public class PoctyBodu {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        s.useLocale(Locale.US);
        double zero = 0;
        int n = s.nextInt();
        int[] kvadrantyPocet = new int[4];
        for (int i=0; i < n; i++){
            double x = s.nextDouble();
            double y = s.nextDouble();
            if(x >= zero && y >= zero) kvadrantyPocet[0]++;
            if(x < zero && y >= zero) kvadrantyPocet[1]++;
            if(x <= zero && y < zero) kvadrantyPocet[2]++;
            if(x > zero && y < zero) kvadrantyPocet[3]++;
        }
        System.out.printf("%d %d %d %d%n", kvadrantyPocet[0], kvadrantyPocet[1], kvadrantyPocet[2], kvadrantyPocet[3]);
    }
}
