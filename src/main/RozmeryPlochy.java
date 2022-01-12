package main;

import java.util.Scanner;

public class RozmeryPlochy {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int hMax = 0;
            int lrMax = 0;
            int llMax = 0;
            int dMax = 0;
            int x = 0;
            int y = 0;

            StringBuilder line = new StringBuilder();
            do {
                line.append(sc.nextLine());
            } while (!line.toString().contains("E"));

            String[] moves = line.toString().split("");
            for (String move : moves) {
                switch (move){
                    case "S":
                        y++;
                        if(hMax < y) hMax = y;
                        break;
                    case "J":
                        y--;
                        if(dMax > y) dMax = y;
                        break;
                    case "V":
                        x++;
                        if(lrMax < x) lrMax = x;
                        break;
                    case "Z":
                        x--;
                        if(llMax > x) llMax = x;
                        break;
                }
            }
            System.out.printf("%d %d%n",  lrMax + (-1*llMax) + 1, hMax + (-1*dMax) + 1 );
        }
    }
}
