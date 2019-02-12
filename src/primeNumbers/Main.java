package primeNumbers;

import java.util.Scanner;

public class Main {

    public static boolean isNumberPrime(int value) {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.println("Put the number to check: ");
        int x = digit.nextInt();

        if (isNumberPrime(x))
            System.out.println("true");
        else System.out.println("false");

    }
}
