package main;

import java.util.Scanner;

public class DelitelNasobek {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        long input1, input2;
        StringBuilder output = new StringBuilder();

        do{
            input1 = s.nextLong();
            if(input1 <= 0) break;
            input2 = s.nextLong();

            output.append(String.format("%s %s", getNumbersDivider(input1, input2), getNumbersMultiplier(input1, input2)));
            output.append('\n');
        }while(true);
        System.out.println(output);
    }

    public static long getNumbersMultiplier(long num1, long num2){
        return (num1 * num2)/getNumbersDivider(num1, num2);
    }

    public static long getNumbersDivider(long num1, long num2){
        long zbytek = 0;
        do {
            zbytek = num1 % num2;
            num1 = num2;
            num2 = zbytek;
        } while (num2 != 0);

        return num1;
    }
}
