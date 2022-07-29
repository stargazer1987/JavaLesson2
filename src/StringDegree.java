import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringDegree {

    private String inputString;
    private int degreeOrRoot;
    private Scanner sc = new Scanner(System.in);

    public StringDegree() {
    }

    public Map<String,Integer> getInput() {
        Map<String,Integer> input = new HashMap<>();
        System.out.println("Enter the string");
        inputString=sc.nextLine().toLowerCase();
        System.out.println("Enter degree or root, not null from -100001 to 100001");
        degreeOrRoot=sc.nextInt();
        input.put(inputString,degreeOrRoot);
        return input;
    }

    public static String solution(Map<String,Integer> input) {
        String result = "";
        Object inputString = input.keySet().toArray()[0];
        int degreeOrRoot = input.get(inputString);
        if (degreeOrRoot > 0) {
            for(int i=0;i<degreeOrRoot;i++) {
                result += (String) inputString;
            }

        } else if (degreeOrRoot < 0) {
            if (getRoot(input)) {
                String inputStr = (String) inputString;
                String temp = inputStr.substring(0, inputStr.length() / Math.abs(degreeOrRoot));

                if (inputStr.replace(temp, "").equals("")) {
                    if (temp.length() <= 1023) {
                        result = temp;
                    } else {
                        result = temp.substring(0, 1023);
                    }
                }

            } else {
                result += "NO SOLUTION";
            }
        } else {
            result += "NO SOLUTION";
        }

        return result;
    }

    public static boolean getRoot(Map<String,Integer> input) {
        Object inputString = input.keySet().toArray()[0];
        int string =  Math.abs(inputString.toString().length());
        int degreeOrRoot = input.get(inputString);

        if (string%degreeOrRoot==0) {
            return true;

        } else {
            return false;
        }
    }

}
