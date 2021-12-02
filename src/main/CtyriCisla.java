package main;

import java.util.Scanner;

public class CtyriCisla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfCycles = sc.nextInt();

        for(int i = 0; i < numberOfCycles; i++){

            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            int pom;

            while(c1 > c2 || c2 > c3 || c3 > c4){
                if(c1 > c2){
                    pom = c2;
                    c2 = c1;
                    c1 = pom;
                }
                if(c2 > c3){
                    pom = c3;
                    c3 = c2;
                    c2 = pom;
                }
                if(c3 > c4){
                    pom = c4;
                    c4 = c3;
                    c3 = pom;
                }
            }
            System.out.printf("%d %d %d %d%n",c1,c2,c3,c4);
        }
    }
}
