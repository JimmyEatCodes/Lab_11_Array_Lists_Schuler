import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Celsius = 0;
        double Farenheit = 0;
        final double CONVERSION_RATE = 1.8;
        final int CONSTANT = 32;
        String trash = "";
        boolean validNumber = false;

        do {
            System.out.print("Enter the temperature in Celsius to convert it: ");
            if (in.hasNextDouble())
            {
                Celsius = in.nextDouble();
                in.nextLine();
                Farenheit = Celsius * CONVERSION_RATE + CONSTANT;
                validNumber = true;

                System.out.println(Celsius + " Degrees Celsius converted to Fahrenheit is " + Farenheit +" Fahrenheit.");
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is an invalid entry. Please enter a valid number.");

            }


        } while (!validNumber);

    }

    }
