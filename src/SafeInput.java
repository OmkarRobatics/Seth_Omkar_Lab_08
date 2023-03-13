import java.util.Scanner;


public class SafeInput {

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt for the user
     * @return a String response that is not zero length
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {

        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print(prompt); // show prompt
            retString = pipe.nextLine();
        } while (retString.length() == 0); // prompts again if input has no characters
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        // var declarations
        int result = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print(prompt + ": "); // displays prompt and adds space
            if (pipe.hasNextInt()) // checks for integer value
            {
                result = pipe.nextInt(); // stores input
                pipe.nextLine(); // clears buffer
                done = true;
            } else // value is not int
            {
                trash = pipe.nextLine(); // stores in trash
                System.out.println("You must enter a integer value: " + trash); // displays mistake
            }
        } while (!done);
        return result;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        //var declarations
        double result = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print(prompt + ": "); // prompts user
            if (pipe.hasNextDouble()) // checks if input is a double value
            {
                result = pipe.nextDouble(); // stores input
                pipe.nextLine(); // clears buffer
                done = true;
            } else
            {
                trash = pipe.nextLine(); // stores input in trash
                System.out.println("You must enter a double value: " + trash); // displays mistake
            }
        } while (!done);
        return result;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int lo, int hi)
    {
        //var declarations
        int result = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print(prompt + "[" + lo + "-" + hi + "]: "); // prompts user
            if (pipe.hasNextInt()) // tests if the input is integer
            {
                result = pipe.nextInt(); // stores input
                pipe.nextLine(); // clears buffer
                if (result >= lo && result <= hi) // tests if the integer is in range
                {
                    done = true;
                } else // input out of range
                {
                    System.out.println("You must enter a value in range [" + lo + "-" + hi + "]: " + result); // displays mistake
                }
            } else // input not an int
            {
                trash = pipe.nextLine(); // stores input in trash if input is not an integer
                System.out.println("You must enter a integer value: " + trash); // displays mistake
            }
        } while (!done);
        return result;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double lo, double hi) {
        // var declarations
        double result = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print(prompt + "[" + lo + "-" + hi + "]: "); // displays prompt
            if (pipe.hasNextDouble()) // tests if input is double
            {
                result = pipe.nextDouble(); // stores input
                pipe.nextLine(); // clears buffer
                if (result >= lo && result <= hi) // tests if input is in range
                {
                    done = true;
                } else // out of range input
                {
                    System.out.println("You must enter a value in range [" + lo + "-" + hi + "]: " + result); // displays result
                }
            } else // input is not a double
            {
                trash = pipe.nextLine(); // stores input in trash
                System.out.println("You must enter a integer value: " + trash); //displays mistake
            }
        } while (!done);
        return result;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        // var declarations
        String playAgain = "";
        boolean done = false;
        boolean range = false;
        do {
            System.out.print(prompt); // prompts user
            playAgain = pipe.nextLine(); // stores input
            if (playAgain.equalsIgnoreCase("y")) // tests if user responds with yes
            {
                done = true;
                range = true;
            } else if (playAgain.equalsIgnoreCase("n")) // tests if user responds with no
            {
                done = false;
                range = true;
            } else // user makes a mistake
            {
                System.out.println("You must enter a valid response (Y or N): " + playAgain); // tells user what their mistake was
                done = false;
                range = false;
            }
        } while (range == false); // loops if user makes a mistake
        return done;
    }

    public static String getRegexString(Scanner pipe, String prompt, String regEx) {
        // var declarations
        String value = "";
        boolean gotAValue = false;
        do {
            System.out.print(prompt + ": "); // displays prompt
            value = pipe.nextLine(); // inputs response
            if (value.matches(regEx)) // tests if correct
            {
                gotAValue = true;
            } else {
                System.out.println("Invalid input: " + value); // displays mistake
            }
        } while (!gotAValue);

        return value;
    }
}

