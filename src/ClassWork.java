import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ClassWork {
    private int starsNumber;
    private int height;
    private int width;
    private int firstNum;
    private int secondNum;
    private Scanner sc = new Scanner(System.in);


    public ClassWork() {

    };

    public int saveStarsNumber(){
        System.out.println("Enter the number of stars");
        starsNumber=sc.nextInt();
        return starsNumber;
    }

    public static void printStars(int starsNumber) {
        for (int i = 0; i < starsNumber; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("------");
    }

    public static void printSquare(int starsNumber) {
        for (int i = 0; i < starsNumber; i++) {
            System.out.print("*");
            for (int j = 0; j < starsNumber - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------");
    }

    public Map<Integer,Integer> saveMeasurements() {
        Map<Integer,Integer> rectangle = new HashMap<>();
        System.out.println("Enter the height of rectangle");
        height = sc.nextInt();
        System.out.println("Enter the width of rectangle");
        width = sc.nextInt();
        rectangle.put(height,width);
        return rectangle;
    }

    public static void printRectangle(Map<Integer,Integer> rectangle){
        Object width = rectangle.keySet().toArray()[0];
        int height = rectangle.get(width);
        for (int i = 0; i < (Integer) width; i++) {
            System.out.print("*");
            for (int j = 0; j < height - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------");
    }

    public Map<Integer,Integer> saveNumbers() {
        Map<Integer,Integer> numbers = new HashMap<>();
        System.out.println("Enter the firstNum");
        firstNum=sc.nextInt();
        System.out.println("Enter the secondNum");
        secondNum=sc.nextInt();
        numbers.put(firstNum,secondNum);
        return numbers;
    }

    public static void isDivisible(Map<Integer,Integer> numbers) {
        Object firstNum = numbers.keySet().toArray()[0];
        int secondNum = numbers.get(firstNum);
        int result;
        try {
            result = (Integer) firstNum/secondNum;
            System.out.println("Is divisible");
        } catch (ArithmeticException e) {
            System.out.println("Is not divisible");
        }
        System.out.println("------");
    }

    public double factorial() {
        System.out.println("Enter the positive number");
        double numberForFactorial=sc.nextDouble();
        double result = 1;
        if (numberForFactorial != 0) {
            for (double i = 1; i <= numberForFactorial; i++) {
                result *= i;
            }
        }
        return result;

    }
}
