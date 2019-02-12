package commonString;

public class Main {
    public static void main(String[] args) {

        String arr[] ={"AAABBA","ABAABBAAA"};

        String letters= findletters(arr);
        System.out.println(letters);

    }

    public static String findletters(String[] arr) {
        int n = arr.length;
        String s = arr[0];
        int length = s.length();
        String response = "";

        for (int i=0; i<length; i++){
            for (int j=i+1; j<= length; j++){
                String letter = s.substring(i,j);
                int k =1;
                for (k=1; k<n;k++)
                    if (!arr[k].contains(letter))
                        break;
                    if (k==n && response.length()<letter.length())
                        response=letter;

            }
        }return response;
    }
}
