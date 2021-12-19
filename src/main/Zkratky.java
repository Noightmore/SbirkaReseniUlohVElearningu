package main;

import java.util.Locale;
import java.util.Scanner;

public class Zkratky {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        String[] veta;
        for(int i = 0; i < n; i++){
            veta = sc.nextLine().split(" ");
            StringBuilder zkratka = new StringBuilder();
            for (String s : veta) {
                if (s.toCharArray().length > 2) {
                    zkratka.append(s.toUpperCase(Locale.ROOT).split("")[0]);
                }
            }
            System.out.println(zkratka);
        }
    }
}
