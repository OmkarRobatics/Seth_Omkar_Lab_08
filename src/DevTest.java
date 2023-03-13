import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // sets up scanner class
        String str0 = SafeInput.getNonZeroLenString(in, "enter your name: "); // calls method to test if input has characters
        System.out.println(str0); // displays name
        int num = SafeInput.getInt(in, "enter a integer"); // calls get int method
        System.out.println(num); // displays input
         double dub = SafeInput.getDouble(in, "enter a double"); // calls get double method
        System.out.println(dub); // displays input
int rangeNum = SafeInput.getRangedInt(in, "Enter a integer", 1, 12); // calls get ranged int method
        System.out.println(rangeNum); // displays input
        double rangeDub = SafeInput.getRangedDouble(in, "Enter a double", 1.3, 100.1); // calls get ranged double method
        System.out.println(rangeDub); // displays input
        boolean yesOrNo = SafeInput.getYNConfirm(in,"Would you like to play again? Respond with Y for yes and N for no: "); // calls yes or no method
        System.out.println(yesOrNo); // displays input
        String pattern = SafeInput.getRegexString(in,"Enter your phone number","\\d{3}-\\d{3}-\\d{4}"); // calls reg ex method
        System.out.println(pattern); // displays input
    }
}
