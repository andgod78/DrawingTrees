

public class Main {
    public static void main(String[] args) {
        String[][] tablica = new String[6][6];

        printTree1(tablica);
        System.out.println();
        printTree2(tablica);
        System.out.println();
        printTree3(tablica);
        System.out.println();
        printTree4(tablica);
        System.out.println();
        printTree5(tablica);
        System.out.println();
        printTree6(tablica);


    }

    private static void printTree1(String[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println();

            for (int j = 0; j < tablica.length; j++) {
                tablica[i][j] = "*";
                if (j <= i)
                    System.out.print(tablica[i][j]);
            }
        }
    }

    private static void printTree2(String[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println();

            for (int j = 0; j < tablica.length; j++) {
                if (i == j)
                    tablica[i][j] = "*";
                else
                    tablica[i][j] = " ";
                System.out.print(tablica[i][j]);

            }
        }
    }

    private static void printTree3(String[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println();

            for (int j = 0; j < tablica.length; j++) {
                if (i == 0)
                    tablica[i][j] = "*";
                else if (j == 0)
                    tablica[i][j] = "*";
                else if (i == 5)
                    tablica[i][j] = "*";
                else if (j == 5)
                    tablica[i][j] = "*";
                else
                    tablica[i][j] = " ";
                System.out.print(tablica[i][j]);
            }
        }
    }

    private static void printTree4(String[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println();
            for (int j = 0; j < tablica.length; j++) {
                if (i == j)
                    tablica[i][j] = "*";
                else if ((i + j) == tablica.length - 1)
                    tablica[i][j] = "*";
                else
                    tablica[i][j] = " ";
                System.out.print(tablica[i][j]);
            }
        }
    }

    private static void printTree5(String[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println();
            for (int j = 0; j < tablica.length; j++) {
                if (i <= j)
                    tablica[i][j] = "*";
                else
                    tablica[i][j] = " ";
                System.out.print(tablica[i][j]);
            }
        }
    }

    private static void printTree6(String[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println();
            for (int j = 0; j < tablica.length; j++) {
                if ((i+j)==tablica.length-1)
                    tablica[i][j] = "*";
                else if ((i+j)== tablica.length)
                    tablica[i][j] = "*";
                else if ((i+j)==tablica.length+1)
                    tablica[i][j] = "*";
                else if ((i+j)==tablica.length+2)
                    tablica[i][j] = "*";
                else if ((i+j)==tablica.length+3)
                    tablica[i][j] = "*";
                else if ((i+j)==tablica.length+4)
                    tablica[i][j] = "*";
                else
                    tablica[i][j] = " ";
                System.out.print(tablica[i][j]);
            }
        }
    }
}
