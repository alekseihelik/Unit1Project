import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is the total bill amount?"); //prompts user input for bill
        double total = s.nextDouble();
        System.out.print("What percent do you want to tip?"); //prompts user input for tip percent
        double tipPercent = s.nextDouble();
        System.out.print("How many people are in your group?"); //prompts user input for the amount of people
        int numberOfPeople = s.nextInt();
        double totalTipAmount = ((tipPercent/100.0)*total); //calculates the total amount of tip
        double totalIncludingTip = totalTipAmount + total; //calculates the bill with the tip
        double tipPerPerson = totalTipAmount/numberOfPeople; //calculates how much tip each person pays
        double totalPerPerson = totalIncludingTip/numberOfPeople; //calculates how much total money each person pays
        System.out.println("Your total tip amount is: " + Math.round((totalTipAmount/100.0)*100.0));
        System.out.println("Your total bill including tip is: " + Math.round((totalIncludingTip/100.0)*100.0));
        System.out.println("The tip per person is: " + Math.round((tipPerPerson/100.0)*100.0));
        System.out.println("The total per person is: " + Math.round((totalPerPerson/100.0)*100.0));
    }
}
