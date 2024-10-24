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
