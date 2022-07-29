import java.util.Scanner;

public class LuckyNumber {
    public LuckyNumber() {

    }

    public void isLucky() {
        Scanner scanner = new Scanner(System.in);
        String luckyNumber;
        int result = 0;
        do {
            System.out.println("Enter a 6-digit number");
            luckyNumber = scanner.nextLine();
        } while (luckyNumber.length() != 6);

        try  {
            Integer.parseInt(luckyNumber);
        } catch (NumberFormatException e) {
            System.out.println("Enter a 6-digit number please");
            System.exit(1);
        }

        for (int i=0; i < luckyNumber.length()/2; i++) {
            result += luckyNumber.charAt(i);
        }
        for (int i=luckyNumber.length()/2; i < luckyNumber.length(); i++) {
            result -= luckyNumber.charAt(i);
        }
        if (result == 0) {
            System.out.println("You've got a lucky number!");
        } else {
            System.out.println("Your number is not lucky one:(");
        }
        System.out.println("-------");
    }
}

