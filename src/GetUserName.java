import java.util.Scanner;

public class GetUserName

        {
            public static void main(String[] args)
            {
                Scanner in = new Scanner(System.in); // sets up scanner class
                //var declarations
                String firstName = "";
                String lastName = "";
                // prompts safely for first and last name
                firstName = SafeInput.getNonZeroLenString(in, "Enter your first name: ");
                lastName = SafeInput.getNonZeroLenString(in, "Enter your last name: ");

                System.out.println("\nYour full name is: " + firstName + " " + lastName); // displays full name
            }

        }
