import java.util.Scanner;

public class Palindrom {

    public Palindrom() {

    };

    public boolean isPalindrom(String string) {
        String reverseString = new StringBuilder(string).reverse().toString();
        boolean result = string.equals(reverseString)? true : false;
        return result;
    }

    public String saveString() {
        System.out.println("Enter some string");
        Scanner scanner = new Scanner(System.in);
        String newString = scanner.nextLine();
        return newString;
    }
}
