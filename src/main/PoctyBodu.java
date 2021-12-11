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
            double input1 = s.nextDouble();
            double input2 = s.nextDouble();
            if(input1 >= zero && input2 >= zero) kvadrantyPocet[0]++;
            if(input1 < zero && input2 >= zero) kvadrantyPocet[1]++;
            if(input1 <= zero && input2 < zero) kvadrantyPocet[2]++;
            if(input1 > zero && input2 < zero) kvadrantyPocet[3]++;
        }
        System.out.printf("%d %d %d %d%n", kvadrantyPocet[0], kvadrantyPocet[1], kvadrantyPocet[2], kvadrantyPocet[3]);
    }
}
