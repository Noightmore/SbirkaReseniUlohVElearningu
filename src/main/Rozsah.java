package main;

import java.util.Scanner;

public class Rozsah {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        do{
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;

            n = s.nextInt();

            for(int i = 0; i<n; i++){
                long input = s.nextLong();
                if(input > max)  max = input;
                if(input < min)  min = input;
            }
            System.out.printf("%d %d%n", min, max);
        }while(n > 0);


    }
}
