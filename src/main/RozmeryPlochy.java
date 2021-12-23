package main;


import java.util.Scanner;

public class RozmeryPlochy {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int hMax = 1;
            int lMax = 1;
            int x = 0;
            int y = 0;
            String[] moves = sc.next().split("");
            for (String move : moves) {
                switch (move){
                    case "S":
                        y++;
                    case "J":
                        y--;
                    case "V":
                        x++;
                    case "Z":
                        x--;
                }
                if(hMax < Math.abs(y)) hMax = Math.abs(y);
                if(lMax < Math.abs(x)) lMax = Math.abs(x);
            }
            System.out.printf("%d %d%n", hMax, lMax);
        }
    }
}
