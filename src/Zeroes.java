import java.util.Scanner;


public class Zeroes {
    private Scanner scanner = new Scanner(System.in);
    public Zeroes() {

    }
    public int countZeroes(){
        System.out.println("Enter the string with 0's and 1's");
        int result = 0;
        int currentSum = 0;
        String line = scanner.nextLine();
        try  {
            Double.parseDouble(line);
            for(int i=0;i<line.length();i++) {
                if (line.charAt(i) == '0') {
                    currentSum += 1;
                } else if (line.charAt(i) == '1'){
                    if (currentSum >= result) {
                        result = currentSum;
                    }
                    currentSum = 0;
                } else {
                    System.out.println("Enter the string with 0's and 1's only please");
                    System.exit(1);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter the string with 0's and 1's please");
            System.exit(1);
        }

        return result;
    }
}
