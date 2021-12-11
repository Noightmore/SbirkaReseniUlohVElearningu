package main;

import java.util.Scanner;

public class Pocet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int firstNumberNonTrivialDividerCount = 0;

        int pocetUloh = s.nextInt();

        for(int k = 0; k < pocetUloh; k++){
            boolean isFirstNum = true;
            int pocetPrvkuCoMaStejnyPocetNetrivialnichDelitelu = 0;
            while(true){
                int dividerCount = 0;
                int input = s.nextInt();
                if(input <= 0) break;
                for(int delitel=2;delitel < input-1; delitel++){
                    if(input % delitel == 0) dividerCount++;
                }
                if(isFirstNum){
                    firstNumberNonTrivialDividerCount = dividerCount;
                    isFirstNum = false;
                    continue;
                }
                if(firstNumberNonTrivialDividerCount == dividerCount){
                    pocetPrvkuCoMaStejnyPocetNetrivialnichDelitelu++;
                }
            }
            System.out.println(pocetPrvkuCoMaStejnyPocetNetrivialnichDelitelu);
        }
    }
}
