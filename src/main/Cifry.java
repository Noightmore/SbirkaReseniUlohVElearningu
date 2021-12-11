package main;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Cifry {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        while(true){
            String input = s.next();
            if("-1".equals(input)) break;
            System.out.println(getSum(input) + " " + getMul(input));
        }
    }
    
    static long getSum(String number){
        long sum = 0;
        for (String num: number.split("")) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
    static long getMul(String number){
        long mul = 1;
        for (String num: number.split("")) {
            mul *= Integer.parseInt(num);
        }
        return mul;
    }
}

