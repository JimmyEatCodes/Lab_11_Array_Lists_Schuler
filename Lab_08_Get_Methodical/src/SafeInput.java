import java.util.Scanner;

public class SafeInput
{

    /**
     get a String val from the user which must be at least one character

     @param pipe Scanner to use for input
     @param prompt
     @return returns a finished value

     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";
        do
        {
            System.out.print(prompt + ": ");

            retVal = pipe.nextLine();

            if(retVal.isEmpty())
            {
                System.out.println("You must enter at least one character");
            }

        }while(retVal.isEmpty());

        return retVal;
    }

    /**
     * returns an unconstrained integer
     *
     * @param pipe - Scanner to use to get the input
     * @param prompt - Prompt to tell the user what to input
     * @return - Returns an unconstrained integer provided by the user
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        int retVal = 0;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("That is an invalid value. Enter an integer, not " + trash);
            }
        } while(!done);

        return retVal;
    }

    /**
     * Get an unconstrained double from the user
     *
     * @param pipe - Scanner to read the user's input
     * @param prompt - Prompts the user for an input
     * @return - Returns an unconstrained double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        double retVal = 0;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("That is an invalid value. Enter a double, not " + trash);
            }
        } while(!done);

        return retVal;
    }

    /**
     * Gets a double from a user within a specified (inclusive) range
     *
     * @param pipe - Scanner for the user's input
     * @param prompt - Prompts the user for an input
     * @param low - Low bound of the range
     * @param high - High bound for the range
     * @return - Returns a double within the inclusive range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        double retVal = 0;
        String trash = "";

        do {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a Double between " + low + " and " + high + " not " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("That is an invalid value. Enter a Double, not " + trash);
            }
        } while(!done);

        return retVal;
    }

    /**
     * Gets a Y or N from the user, returning the equivalent true or false
     *
     * @param pipe - Scanner that gets an input from the user
     * @param prompt -Prompts the user for a Yes or No input
     * @return - Returns true for yes, and false for no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = false;
        String input = "";
        boolean done = false;

        do {
            System.out.print(prompt + "[YyNn]:  ");
            input = pipe.nextLine();
            if(input.isEmpty())
            {
                System.out.println("You must enter Y or N!");
            }else if(input.equalsIgnoreCase("Y")) {
                retVal = true;
                done = true;
            } else if(input.equalsIgnoreCase("N")) {
                retVal = false;
                done = true;
            } else {
                System.out.println("You must enter Y or N! Not " + input);
            }

        } while(!done);
        {
            return retVal;
        }

    }

    /**
     * Gets an integer from a user within a specified (inclusive) range
     *
     * @param pipe - Scanner for the user's input
     * @param prompt - Prompts the user for an input
     * @param low - Low bound of the range
     * @param high - High bound for the range
     * @return - Returns an integer within the inclusive range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        int retVal = 0;
        String trash = "";

        do {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter an integer between " + low + " and " + high + " not " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("That is an invalid value. Enter an integer, not " + trash);
            }
        } while(!done);

        return retVal;
    }

        /**
         * returns a String value that matches a regular expression
         *
         * @param pipe the scanner to use for input
         * @param prompt prompt - tells the user what to input
         * @param regEx String - regular expression pattern to match
         * @return
         */
        public static String getRegExString(Scanner pipe, String prompt, String regEx)
        {
            boolean done = false;
            String retVal = "";
            do
            {
                System.out.print(prompt + regEx + ": ");

                retVal = pipe.nextLine();

                if(retVal.matches(regEx))
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value that matches pattern " + regEx + " not " + retVal);
                }
            }while(!done);

            return retVal;

        }


}
