import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String playerOne = "";
        String playerTwo = "";
        String playAgain = "";
        boolean donePlayOne = false;
        boolean donePlayTwo = false;
        boolean doneInput = false;
        boolean donePlaying = false;

        do {

            donePlayOne = false;
            donePlayTwo = false;
            doneInput = false;

            do {
                System.out.print("Let's play a round of Rock, Paper, Scissors! Player One, enter your move [R/P/S]: ");
                playerOne = in.nextLine();
                if(playerOne.equalsIgnoreCase("R"))
                {
                    donePlayOne = true;}
                else if(playerOne.equalsIgnoreCase("P"))
                {
                    donePlayOne = true;}
                else if(playerOne.equalsIgnoreCase("S"))
                {
                    donePlayOne = true;}
                else
                    System.out.println(playerOne + " is an invalid move. Please pick R/P/S.");
            }while(!donePlayOne);

            do {
                System.out.print("Player Two, enter your move [R/P/S]: ");
                playerTwo = in.nextLine();
                if(playerTwo.equalsIgnoreCase("R"))
                {
                    donePlayTwo = true;}
                else if(playerTwo.equalsIgnoreCase("P"))
                {
                    donePlayTwo = true;}
                else if(playerTwo.equalsIgnoreCase("S"))
                {
                    donePlayTwo = true;}
                else
                    System.out.println(playerTwo + " is an invalid move. Please pick R/P/S.");
            }while(!donePlayTwo);

            if (playerOne.equalsIgnoreCase("R"))
                if (playerTwo.equalsIgnoreCase("R"))
                {System.out.println("Rock vs Rock! It's a tie!");}
                else if (playerTwo.equalsIgnoreCase("P"))
                {System.out.println("Paper covers Rock! Player Two wins!");}
                else {System.out.println("Rock crushes Scissors! Player One wins!");}

            else if (playerOne.equalsIgnoreCase("P"))
                if (playerTwo.equalsIgnoreCase("R"))
                {System.out.println("Paper covers Rock! Player One wins!");}
                else if (playerTwo.equalsIgnoreCase("P"))
                {System.out.println("Paper vs Paper! It's a tie!");}
                else {System.out.println("Scissors cuts Paper! Player Two wins!");}

            else
            if (playerTwo.equalsIgnoreCase("R"))
            {System.out.println("Rock breaks Scissors! Player Two wins!");}
            else if (playerTwo.equalsIgnoreCase("P"))
            {System.out.println("Scissors cuts Paper! Player One wins!");}
            else {System.out.println("Scissors vs Scissors! It's a tie!");}

            do {
                System.out.print("Would you like to play again? [Y/N]: ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y")) {
                    doneInput = true;
                } else if (playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Thanks for playing!");
                    doneInput = true;
                    donePlaying = true;
                } else
                    System.out.println(playAgain + " is an invalid choice. Please pick Y/N.");

            }while(!doneInput);

        }while(!donePlaying);



    }
}