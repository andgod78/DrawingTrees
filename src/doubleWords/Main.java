package doubleWords;

public class Main {
    public static void main(String[] args) {
        String zdanie = "ABBCABBC";
        String zdanie2= "ABBCABBD";
        char[] words = zdanie.toCharArray();
        char[] words2 = zdanie2.toCharArray();


        System.out.println(areWordsTheSame(words));
        System.out.println(areWordsTheSame(words2));


    }

    public static boolean areWordsTheSame(char[] words) {

        int i1 = 0;
        int i2 = words.length/2;

        for (int i = 0; i < words.length / 2; i++) {
            if (words.length%2>0){
                return false;
            }
            if (words[i1] != words[i2]) {
                return false;
            }
            i1++;
            i2++;


        }return true;



    }
}

