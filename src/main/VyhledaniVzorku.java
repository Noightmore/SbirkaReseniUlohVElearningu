package main;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class VyhledaniVzorku {


    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in).useDelimiter("\n");
        char[] sifrovaciKruh = "QWERTYUIOPASDFGHJKLZXCVBNM_".toCharArray(); sifrovaciKruh[sifrovaciKruh.length-1] = ' ';
        char[] messageDecrypted, messageEncrypted;
        ArrayList<Integer> possibleKs = new ArrayList<>();
        long k;

        long numOfInputs = s.nextLong();

        for (long i = 0; i < numOfInputs; i++){
            System.out.println(sifrovaciKruh.length);
            messageDecrypted = s.next().toUpperCase(Locale.ROOT).toCharArray();
            messageEncrypted = s.next().toUpperCase(Locale.ROOT).toCharArray();

            for(int c = 0; c < messageEncrypted.length; c++){
                k = getK(sifrovaciKruh, messageDecrypted[c], messageEncrypted[c]);
            }

            System.out.println(decrypt(sifrovaciKruh, 8, messageEncrypted));
        }


    }

    private static int getK(char[] sifrovaciKruh, char messageDecrypted, char messageEncrypted){
        int encryptedPos = 0, decryptedPos = 0;
        int k = 0;

        for (int c = 0; c < sifrovaciKruh.length; c++) {
            if(messageDecrypted == sifrovaciKruh[c]) decryptedPos = c;
            if(messageEncrypted == sifrovaciKruh[c]) encryptedPos = c;
        }

        if(decryptedPos < encryptedPos) k = encryptedPos - decryptedPos;
        if(decryptedPos > encryptedPos) k = encryptedPos + sifrovaciKruh.length - decryptedPos - 1;


        System.out.println("decrypted c: " +  messageDecrypted + " : " +  decryptedPos);
        System.out.println("encrypted c: " + messageEncrypted + " : " + encryptedPos);
        System.out.println("K: " + k);

        return k;
    }

    private static char[] decrypt(char[] sifrovaciKruh, int k, char[] encryptedMessage){
        char[] decryptedMessage = new char[encryptedMessage.length];
        for(int i=0; i<encryptedMessage.length; i++){
            int characterPos = -1;
            for(int c=0; c<sifrovaciKruh.length; c++){
                if(sifrovaciKruh[c] == encryptedMessage[i]) characterPos = c;
            }
            if(characterPos - k > 0) decryptedMessage[i] = sifrovaciKruh[characterPos - k];
            else if(characterPos - k < 0) decryptedMessage[i] = sifrovaciKruh[characterPos + sifrovaciKruh.length - k - 1];
        }
        return decryptedMessage;
    }
}
