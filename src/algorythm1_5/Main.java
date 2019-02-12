package algorythm1_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE_PATH = "C:/MojFolder/zadanie1_5.txt";


    public static void main(String[] args) throws IOException {
        List<Integer> numbers = readFile();
        List<Integer> resultList = countResults(numbers);

        System.out.println(resultList);


    }

    private static List<Integer> readFile() throws IOException {
        List<Integer> numbers = new ArrayList<>();

        FileReader filereader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(filereader);

        String digit;

        while ((digit = bufferedReader.readLine()) != null) {
            numbers.add(Integer.parseInt(digit));
        }
        bufferedReader.close();
        return numbers;

    }

    private static List<Integer> countResults(List<Integer> numbers) {
        List<Integer> resultList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j <= i; j++) {
                sum += numbers.get(j);
            }
            resultList.add(sum);
            sum = 0;
        }
        return resultList;


    }


}

