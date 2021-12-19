package main;

import java.math.BigInteger;
import java.util.Scanner;

public class Nasobeni {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            BigInteger n1 = sc.nextBigInteger();
            BigInteger n2 = sc.nextBigInteger();

            System.out.println(n1.multiply(n2));
        }
    }
}
