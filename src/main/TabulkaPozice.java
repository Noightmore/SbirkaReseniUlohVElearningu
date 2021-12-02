package main;

import java.util.Scanner;

public class TabulkaPozice {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int pocetRadku = s.nextInt();
        int pocetSloupcu = s.nextInt();
        int index = s.nextInt();

        System.out.printf("%d %d",  (index - 1) /  pocetSloupcu + 1, (index - 1) % pocetSloupcu + 1);
    }
}
