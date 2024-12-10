import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random gen = new Random();
        Scanner in = new Scanner(System.in);

        int die1 = 0;
        int die2 = 0;
        int Roll = 0;
        int Point = 0;
        String playAgain = "";
        boolean doneInput = false;
        boolean donePlaying = false;
        boolean donePoint = false;



        do {
            System.out.println("Hello! Welcome to the Craps game!");
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;

            Roll = die1 + die2;
            if (Roll == 2 || Roll == 3 || Roll == 12)
            {
                System.out.println("Die 1\tDie 2\tTotal");
                System.out.println("---------------------");
                System.out.printf("%4d\t%4d\t%4d\n", die1, die2, Roll);
                System.out.println("You rolled " + Roll + ", which means you crapped out!");
            }
            else if (Roll == 7 || Roll == 11)
            {
                System.out.println("Die 1\tDie 2\tTotal");
                System.out.println("---------------------");
                System.out.printf("%4d\t%4d\t%4d\n", die1, die2, Roll);
                System.out.println("You rolled " + Roll + ", which means you rolled a natural! You win!");
            }
            else
            {
                System.out.println("Die 1\tDie 2\tTotal");
                System.out.println("---------------------");
                System.out.printf("%4d\t%4d\t%4d\n", die1, die2, Roll);
                System.out.println("You rolled " + Roll + ", this is now the point.");
                Point = Roll;
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;

                Roll = die1 + die2;

                do {
                    die1 = gen.nextInt(6) + 1;
                    die2 = gen.nextInt(6) + 1;
                    Roll = die1 + die2;

                    if (Roll == 7) {
                        System.out.println("Die 1\tDie 2\tTotal");
                        System.out.println("---------------------");
                        System.out.printf("%4d\t%4d\t%4d\n", die1, die2, Roll);
                        System.out.println("You rolled " + Roll + ", which means you crapped out!");
                        donePoint = true;
                    } else if (Roll == Point) {
                        System.out.println("Die 1\tDie 2\tTotal");
                        System.out.println("---------------------");
                        System.out.printf("%4d\t%4d\t%4d\n", die1, die2, Roll);
                        System.out.println("You rolled " + Roll + ", which means you rolled point and won!");
                        donePoint = true;
                    } else {
                        System.out.println("Die 1\tDie 2\tTotal");
                        System.out.println("---------------------");
                        System.out.printf("%4d\t%4d\t%4d\n", die1, die2, Roll);
                        System.out.println("You rolled " + Roll + ", you need a " + Point + " to get point and win.");
                    }
                }while(!donePoint);

            }


            doneInput = false;

            do {
                System.out.print("Would you like to play again? [Y/N]: ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y"))
                {
                    doneInput = true;
                    playAgain = "";
                    donePlaying = false;
                    donePoint = false;
                }
                else if (playAgain.equalsIgnoreCase("N"))
                {
                    System.out.println("Thanks for playing!");
                    doneInput = true;
                    donePlaying = true;
                }
                else
                    System.out.println(playAgain + " is an invalid input. Please pick Y/N.");


            } while (!doneInput);


        }while (!donePlaying);

    }
}