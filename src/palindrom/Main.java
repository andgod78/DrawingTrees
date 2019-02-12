package palindrom;

public class Main {
    public static void main(String[] args) {
        String a = "kajak";
        String b = "potop";
        String c = "radar";
        String d = "owocowo";
        String e = "A to kanapa pana Kota";


        char[] word = a.toCharArray();
        char[] word1 = b.toCharArray();
        char[] word2 = c.toCharArray();
        char[] word3 = d.toCharArray();
        char[] word4 = e.toCharArray();


        System.out.println(isTheWordPalindrom(word));
        System.out.println(isTheWordPalindrom(word1));
        System.out.println(isTheWordPalindrom(word2));
        System.out.println(isTheWordPalindrom(word3));
        System.out.println(isTheWordPalindrom(word4));

        removeAllSpace(e);


    }

    private static void removeAllSpace(String e) {
        String f = e.replaceAll("\\s", "");
        String g = f.toLowerCase();
        char[] word5 = g.toCharArray();
        System.out.println(isTheWordPalindrom(word5));
    }

    private static boolean isTheWordPalindrom(char[] word) {


        int i1 = 0;
        int i2 = word.length - 1;


        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }

        return true;
    }
}


