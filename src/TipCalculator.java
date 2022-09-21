import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is the total bill amount?");
        double total = s.nextDouble();
        System.out.print("What percent do you want to tip?");
        double tipPercent = s.nextDouble();
        System.out.print("How many people are in your group?");
        int numberOfPeople = s.nextInt();
    }
}
