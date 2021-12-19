package main;

import java.util.Scanner;

public class Maxima {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Maximum max1, max2, max3, max4;
        int pocetUloh = s.nextInt();

        for(int k = 0; k < pocetUloh; k++){

            max1 = Maximum.defaultState();
            max2 = Maximum.defaultState();
            max3 = Maximum.defaultState();
            max4 = Maximum.defaultState();

            while(true){
                int input = s.nextInt();
                if(input <= 0) break;

               if(input != max4.hodnota && input != max3.hodnota && input != max2.hodnota && input != max1.hodnota){
                   if(max4.hodnota < input){
                       max4 = new Maximum(input, 1);
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
                       if(max2.hodnota > max1.hodnota){
                           Maximum max = max1;
                           max1 = max2;
                           max2 = max;
                       }
                   }
               }else{
                   if(input == max4.hodnota) max4.pocetVyskytu++;
                   if(input == max3.hodnota) max3.pocetVyskytu++;
                   if(input == max2.hodnota) max2.pocetVyskytu++;
                   if(input == max1.hodnota) max1.pocetVyskytu++;
               }
            }

            System.out.printf("%d %d%n", max1.hodnota, max1.pocetVyskytu);
            System.out.printf("%d %d%n", max2.hodnota, max2.pocetVyskytu);
            System.out.printf("%d %d%n", max3.hodnota, max3.pocetVyskytu);
            System.out.printf("%d %d%n", max4.hodnota, max4.pocetVyskytu);
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

        public static Maximum defaultState(){
            return new Maximum(Integer.MIN_VALUE, 1);
        }
    }
}
