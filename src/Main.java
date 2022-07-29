import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //ClassWork
        /*ClassWork classWork = new ClassWork();
        classWork.printStars(classWork.saveStarsNumber());
        classWork.printSquare(classWork.saveStarsNumber());
        classWork.printRectangle(classWork.saveMeasurements());
        classWork.isDivisible(classWork.saveNumbers());
        System.out.println("Factorial = " + classWork.factorial());
        System.out.println("------");*/

        // HomeWork

        /*// Bulls
        Bulls bull = new Bulls();
        String computerNumber ="";
        do {
            computerNumber = bull.generateNumber();
        } while (!(bull.checkUnique(computerNumber)));

        bull.compareNumbers(computerNumber,bull.enterNumber());

        // Palindrom
        Palindrom palindrom = new Palindrom();
        System.out.println("Is Palindrom? " + palindrom.isPalindrom(palindrom.saveString()));
        System.out.println("------");

        // LuckyNumber
        LuckyNumber luckyNumber = new LuckyNumber();
        luckyNumber.isLucky();

        // Zeroes
        Zeroes zeroes = new Zeroes();
        System.out.println("Max number of zeroes: " + zeroes.countZeroes());

        //StringDegree
        StringDegree stringDegree = new StringDegree();
        System.out.println(stringDegree.solution(stringDegree.getInput()));*/

        //UnpackString
        UnpackString unpackString = new UnpackString();
        System.out.println(unpackString.unpack().toString());

        //CountRepeats
        CountRepeats countRepeats = new CountRepeats();
        HashMap<String,Integer> result = countRepeats.countRepeats();
        System.out.println(result);

    }
}
