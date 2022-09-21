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
        double totalTipAmount = ((tipPercent/100)*total);
        double totalIncludingTip = totalTipAmount + total;
        double tipPerPerson = totalTipAmount/numberOfPeople;
        double totalPerPerson = totalIncludingTip/numberOfPeople;
        System.out.println("Your total tip amount is: " + Math.round((totalTipAmount/100.0)*100.0));
        System.out.println("Your total bill including tip is: " + Math.round((totalIncludingTip/100.0)*100.0));
        System.out.println("The tip per person is: " + Math.round((tipPerPerson/100.0)*100.0));
        System.out.println("The total per person is: " + Math.round((totalPerPerson/100.0)*100.0));
    }
}
