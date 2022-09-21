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
        System.out.printf("Your total tip amount is: $%.2f%n" , totalTipAmount); //printf and %.2f%n are used to round the variables to two decimals
        System.out.printf("Your total bill including tip is: $%.2f%n" , totalIncludingTip);
        System.out.printf("The tip per person is: $%.2f%n" , tipPerPerson);
        System.out.printf("The total per person is: $%.2f%n" , totalPerPerson);
    }
}
