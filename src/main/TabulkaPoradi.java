package main;

import java.util.Scanner;

public class TabulkaPoradi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int pocetRadku = s.nextInt();
        int pocetSloupcu = s.nextInt();
        int poziceRadek = s.nextInt();
        int poziceSloupec = s.nextInt();


        System.out.printf("%d",  poziceSloupec - 1 + (poziceRadek - 1) * pocetSloupcu + 1);
    }
}
