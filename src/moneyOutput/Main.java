package moneyOutput;


public class Main {

    public static void main(String[] args) {

        double a = 235.35;

        countMoney(a);
    }

    public static void countMoney(double a) {


        double[] pieniadze = {200, 100, 50, 20, 10, 5, 2, 1,};
        double[] grosze = {0.50, 0.20, 0.10, 0.05,0.02,0.01};
        double[] moneyCounter = new double[pieniadze.length];

        for (int i = 0; i < pieniadze.length; i++) {
            if (a - pieniadze[i] > 0.00) {
                moneyCounter[i] = Math.floor(a / pieniadze[i]);
                a -= moneyCounter[i] * pieniadze[i];

                System.out.println(moneyCounter[i]+" banknot/y " + "o nominale " + pieniadze[i]+" PLN");
            }
        }
        for (int i = 0; i < grosze.length; i++) {
            if (a - grosze[i] > 0) {
                moneyCounter[i] = Math.floor(a / grosze[i]);
                a -= moneyCounter[i] * grosze[i];

                System.out.println(moneyCounter[i]+" moneta/y " + "o nominale " + grosze[i]+" PLN");

            }


        }
    }
}

