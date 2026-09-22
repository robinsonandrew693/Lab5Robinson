import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userBirthMonth;

        System.out.println("What is the number of your birth month?");

        if (scan.hasNextInt()) {
            userBirthMonth = scan.nextInt();
            if (userBirthMonth <= 12 && userBirthMonth >= 1) {
                System.out.println("The number of your birth month is " + userBirthMonth + ".");
            }
            else {
                System.out.println("You inputted an invalid integer value. Please try again next time with any integer from 1-12.");
                System.exit(0);
            }
        }
        else {
            System.out.println("You inputted an invalid data type. Please input an integer next time.");
            System.exit(0);
        }
    }
}
