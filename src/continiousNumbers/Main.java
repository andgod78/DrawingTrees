package continiousNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        continiousNumbers1();
        System.out.println();
        continiousNumbers2();
        System.out.println();
        continiousNumbers3();
        System.out.println();
        continiousNumbers4();
        System.out.println();
        continiousNumbers5();
        System.out.println();



    }


    public static void continiousNumbers1() {

        int x = 1;

        while (x <= 55) {
            System.out.print(x + ",");
            x += 2;
        }

    }

    private static void continiousNumbers2() {
        int x = 100;
        int y = x / 10;


        while (x <= 300) {
            System.out.print(x + "," + y + ",");
            x += 100;
            y = x / 10;
        }

    }

    private static void continiousNumbers3() {
        int x = 0;
        int y = 6;
        System.out.print(x + ",");

        for (int i = 0; i < 3; i++) {
            x += 2;
            System.out.print(x + ",");

        }
        for (int j = 0; j < 3; j++) {
            y -= 2;
            System.out.print(y + ",");
        }
    }

    private static void continiousNumbers4() {
        double x;
        double y = 1;
        int z = 6;

        for (int i = 0; i < z; i++) {

            x = Math.pow(y++, 2);

            System.out.print(x + ",");
        }

    }


    private static void continiousNumbers5() {
        System.out.println("Podaj ilość liczb w ciągu Fibonacciego: ");
        Scanner odczyt = new Scanner(System.in);
        int n = odczyt.nextInt();

        intFibbonacci(n);


    }

    public static int intFibbonacci(int n) {
        int x = 0;
        int y = 1;
        int z=0;


        for (int i = 0; i < n; i++) {
            z = x + y;
            x = y;
            y = z;
            System.out.print(z+",");
        }return z ;

    }
}





