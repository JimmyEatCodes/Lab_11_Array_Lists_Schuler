import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("input the price of your purchase");
        Scanner in = new Scanner(System.in);



        double purchasePrice = 78.99;
        double salesTax = 0;
        final double TAX_RATE = 0.05;
        double finalPrice = 0.00;

        purchasePrice = in.nextDouble();


        salesTax = purchasePrice * TAX_RATE;
        finalPrice = purchasePrice + salesTax;

        System.out.println("The sales tax on a purchase of $ " + purchasePrice + " is " + salesTax + " for a total of $" + finalPrice);






    }
}