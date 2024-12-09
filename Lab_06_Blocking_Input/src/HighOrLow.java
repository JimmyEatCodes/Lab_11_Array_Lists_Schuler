import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            Random generator = new Random();
            int val = 0;
            int Guess = 0;
            String trash = "";
            boolean doneGuess = false;

            do {

                System.out.print("Guess a number between 1 and 10: ");
                if (in.hasNextInt()) {
                    Guess = in.nextInt();
                    in.nextLine();
                    if (Guess >= 1 && Guess <= 10) {
                        System.out.println("Your guess is " + Guess + ".");
                        doneGuess = true;
                    } else {
                        System.out.println("Sorry, you entered " + Guess + ", which is out of range.");
                    }


                } else {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + ". Please enter a valid number.");
                }

            } while (!doneGuess);

            val = generator.nextInt(10) + 1;

            if (val > Guess) {
                System.out.println("The secret number was " + val + " and you guessed " + Guess + ". You guessed too low!");
            } else if (val < Guess) {
                System.out.println("The secret number was " + val + " and you guessed " + Guess + ". You guessed too high!");
            } else {
                System.out.println("The secret number was " + val + " and you guessed " + Guess + ". Perfect guess!!");
            }


        }
    }
