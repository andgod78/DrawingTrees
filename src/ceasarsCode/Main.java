package ceasarsCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Wejście: ");
        String zdanie = wejscie.nextLine().toUpperCase();

        System.out.println(" Wyjście: ");

        ceasarsCode(zdanie);


    }

    public static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public static String ceasarsCode(String zdanie) {

        int shift = 3;
        String zdanie2 = "";


        for (int i = 0; i < zdanie.length(); i++) {
            int charPosition = alphabet.indexOf(zdanie.charAt(i));
            int keyChar = (shift + charPosition) % 26;
            char newChar = alphabet.charAt(keyChar);
            if (zdanie.charAt(i) == ' ') {
                newChar = ' ';
            }


            System.out.print(newChar);
        }
        return zdanie2;

    }

}





