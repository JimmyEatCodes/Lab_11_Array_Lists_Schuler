import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        final int TRIP = 100;
        double fTank = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double drivePrice = 0;
        double fTrip = 0;
        String trash = "";
        boolean dTank = false;
        boolean dEfficiency = false;
        boolean dGas = false;

        do {

            System.out.print("Enter the fuel tank size for your vehicle: ");
            if (in.hasNextDouble())
            { fTank = in.nextDouble();
                in.nextLine();
                dTank = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }

        }while(!dTank);

        do {

            System.out.print("Enter the fuel efficiency in miles per gallon for your vehicle: ");
            if (in.hasNextDouble())
            { fuelEfficiency = in.nextDouble();
                in.nextLine();
                dEfficiency = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }

        }while(!dEfficiency);

        do {

            System.out.print("Enter the current cost of a gallon of fuel for your vehicle: ");
            if (in.hasNextDouble())
            { gasPrice = in.nextDouble();
                in.nextLine();
                dGas = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }

        }while(!dGas);

        drivePrice = TRIP / fuelEfficiency * gasPrice;
        fTrip = fTank * fuelEfficiency;

        System.out.println("At the current fuel price of " + gasPrice + ", it would cost you " + drivePrice + " dollars to travel 100 miles.");
        System.out.println("On a full tank of gas, you can travel " + fTrip + " miles.");



    }



    }

