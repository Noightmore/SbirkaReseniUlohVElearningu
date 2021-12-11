package main;

import java.util.Scanner;

public class Maxima {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int pocetUloh = s.nextInt();

        for(int k = 0; k < pocetUloh; k++){
            Maximum max1 = new Maximum(Integer.MIN_VALUE, 0);
            Maximum max2 = new Maximum(Integer.MIN_VALUE, 0);
            Maximum max3 = new Maximum(Integer.MIN_VALUE, 0);
            Maximum max4 = new Maximum(Integer.MIN_VALUE, 0);

            while(true){
                int input = s.nextInt();
                if(input <= 0) break;
                if(max4.hodnota < input) max4.hodnota = input; max4.pocetVyskytu++;
                if(max4.hodnota > max3.hodnota){
                    Maximum max = max3;
                    max3 = max4;
                    max4 = max;
                }
                if(max3.hodnota > max2.hodnota){
                    Maximum max = max2;
                    max2 = max3;
                    max3 = max;
                }

            }
            System.out.println(pocetPrvkuCoMaStejnyPocetNetrivialnichDelitelu);
        }
    }

    // "implementace structury v jave"
    public static class Maximum {
        public int hodnota;
        public int pocetVyskytu;

        public Maximum(int hodnota, int pocetVyskytu) {
            this.hodnota = hodnota;
            this.pocetVyskytu = pocetVyskytu;
        }
    }
}
