import java.util.HashSet;
import java.util.Scanner;

public class Bulls {
    public Bulls() {

    }
    public String generateNumber2() {
        int min = 0;
        int max = 9;
        String result="";
        HashSet<Integer> numbers = new HashSet<>();
        for(int i=0; i<=9; i++) {
            numbers.add(i);
        }

        int temp;
        for (int i = 0; i <= 3; i++) {
            do {
                temp = (int) (Math.random() * (max - min) + min);
                if (numbers.contains(temp)) {
                    numbers.remove(temp);
                    result += String.valueOf(temp);
                } else {
                   break;
                }
            } while(numbers.contains(temp));
        }
        return result;
    }
    public String generateNumber() {
        int min = 0;
        int max = 9;
        String computerNumber = "";
        for (int i = 0; i <= 3; i++) {
            computerNumber += String.valueOf((int) (Math.random() * (max - min) + min));
        }
        return computerNumber;
    }

    public String enterNumber() {
        System.out.println("Enter 4-digit number without repeats");
        Scanner sc = new Scanner(System.in);
        String userNumber = "";
        userNumber = sc.next();

        if (userNumber.length() != 4) {
            System.out.println("Please, enter 4-digit number without repeats");
            System.exit(1);
        }
        try {
           // Double.parseDouble(userNumber);
            Integer.parseInt(userNumber);
        } catch (NumberFormatException e) {
            System.out.println("Please, enter 4-digit number without repeats");
            System.exit(1);
        }
        if (!checkUnique(userNumber)) {
            System.out.println("You have repeats in your number. Please, enter 4-digit number without them");
            System.exit(1);
        }

        return userNumber;

    }

    public boolean checkUnique(String userNumber) {
        HashSet<Character> digits = new HashSet<>();
        for(int i=0; i < userNumber.length();i++)
        {
            digits.add(userNumber.charAt(i));
        }
        if (!(digits.size() == userNumber.length())){
            return false;
        } else {
            return true;
        }


    }
    public void compareNumbers(String computerNumber, String userNumber) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < computerNumber.length(); i++) {
            for (int j = 0; j < userNumber.length(); j++) {
                if (computerNumber.charAt(i) == userNumber.charAt(j)) {
                    if (i == j) {
                        bulls += 1;
                    } else {
                        cows += 1;
                    }
                }
            }
        }
        System.out.printf("Your numbers is %s, Computer's number is %s", userNumber, computerNumber);
        System.out.println();
        System.out.printf("There are %s bulls and %s cows",bulls,cows);
        System.out.println();
        System.out.println("------");
    }
}
