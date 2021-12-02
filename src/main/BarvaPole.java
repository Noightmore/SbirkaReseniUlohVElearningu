package main;

import java.util.Scanner;

public class BarvaPole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1, input2;
        StringBuilder output = new StringBuilder();

         do{
             input1 = sc.nextInt();
             if(input1 < 0) break;
             input2 = sc.nextInt();
             output.append((input1 % 2 == 0) == (input2 % 2 == 0) ? "BILA" : "CERNA");
             output.append('\n');
         }while(true);
         System.out.println(output);
    }
}
