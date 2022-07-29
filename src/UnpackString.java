import java.util.Scanner;

public class UnpackString {

    public UnpackString() {

    }
    public StringBuilder unpack() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        StringBuilder newStr = new StringBuilder();
        StringBuilder n = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                n.append(str.charAt(i));
            } else {
                if (n.toString().equals("")) {
                    newStr.append(str.charAt(i));
                } else {
                    for (int j = 0; j < Integer.parseInt(n.toString()); j++) {
                        newStr.append(str.charAt(i));
                    }
                }
                n = new StringBuilder();
            }
        }
        return newStr;
    }
}
