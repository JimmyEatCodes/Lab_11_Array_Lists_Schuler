
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

    public class DevTest {


        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            String SSN = getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
            System.out.println("Your Social Security Number is " + SSN);
        }

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

        public static String getNonZeroLenString(Scanner pipe, String prompt)
        {
            String retVal = "";

            do {
                System.out.print(prompt + ": ");
                retVal = pipe.nextLine();
                if (retVal.isEmpty())
                {
                    System.out.println("You must enter at least one character");
                }
            } while(retVal.isEmpty());

            return retVal;
        }

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
                        System.out.println("You must enter an integer between " + low + " and " + high + "not " + retVal);
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

        public static String getRegExString(Scanner pipe, String prompt, String regEx)
        {
            boolean done = false;
            String retVal = "";

            do {
                System.out.print(prompt + regEx + ": ");
                retVal = pipe.nextLine();
                if (retVal.matches(regEx))
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value that matches pattern " + regEx + " not " + retVal);
                }
            } while(!done);

            return retVal;
        }

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

    }
