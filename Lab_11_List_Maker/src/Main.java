import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // rename main

    static ArrayList<String> list = new ArrayList<>();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {


        String cmd = "";
        String menu = "";
        Boolean done = false;
        menu = "A – Add D – Delete I – Insert  P – Print Q – Quit";

        do {

            showList();
            cmd = SafeInput.getRegExString(in, menu + "\nEnter your choice: ","[aAdDiIpPqQ]");

            switch (cmd)
            {
                case "A":
                case "a":
                    add();
                break;
                case "D":
                case "d":

                break;
                case "I":
                case "i":

                break;
                case "P":
                case "p":

                break;
                case "Q":
                case "q":
                    quit();
                break;
            }

        }while(!done);



    }

    private static void quit()
    {
        System.exit(0);
    }

    private static void showList()
    {
       for(String l:list)
       {
           System.out.println(l);
       }
    }

    private static void add()
    {
        String line = "";

        line = SafeInput.getNonZeroLenString(in, "Enter the line to add to the list" );

        list.add(line);
    }









}