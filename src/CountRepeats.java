import java.util.HashMap;
import java.util.Scanner;

public class CountRepeats {

    public CountRepeats() {

    }

    public HashMap<String, Integer> countRepeats() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        String[] item = str.split(" ");

        HashMap<String, Integer> HashMapNumberOfWords = new HashMap<>();

        for (String t : item) {
            if (HashMapNumberOfWords.containsKey(t)) {
                HashMapNumberOfWords.put(t, HashMapNumberOfWords.get(t) + 1);

            } else {
                HashMapNumberOfWords.put(t, 1);
            }
        }

        return HashMapNumberOfWords;


    }
}

