import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userAge;

        System.out.println("What is your age?");

        if (scan.hasNextInt()) {
            userAge = scan.nextInt();
            if (userAge > 120) {
                System.out.println("You inputted an invalid age. Please make sure it is correct next time.");
                System.exit(0);
            }
            if (userAge >= 21) {
                System.out.println("You get a wristband.");
            }
            else if (userAge > 0) {
                System.out.println("You are too young for a wristband.");
            }
            else {
                System.out.println("You inputted an invalid age. Please make sure it is correct next time.");
                System.exit(0);
            }
        }
        else {
            System.out.println("You inputted an invalid data type for your age. Please enter a positive integer next time.");
            System.exit(0);
        }
    }
}
