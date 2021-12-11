package main;

import java.util.Scanner;

public class RozkladCisla {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        while(true){
            int input = s.nextInt();
            if(input == -1) break;
            if(isPrime(input)){
                System.out.println(input);
                continue;
            }


            System.out.println(getPrimeNumberRow(input));
        }
    }

    // Function to check whether a number
    // is a prime number or not
    static boolean isPrime(int num)
    {

        for(int i = 2; i * i <= num; i++)
        {
            if ((num % i) == 0)
                return false;
        }
        return num > 1;
    }
    static String getPrimeNumberRow(int input){
        StringBuilder output = new StringBuilder();
        int n = 0;

        while (input != 1)
        {
            for (int i = 2; i <= input; i++)
            {
                if ((input% i) == 0)
                {
                    n = i;
                    break;
                }
            }

            output.append(n).append(" ");

            input /= n;
        }
        return output.toString();
    }
}
