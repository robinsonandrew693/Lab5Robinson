import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userParty;

        System.out.println("What is your political party affiliation? R for Republican, D for Democrat, and I for Independent.");
        if (scan.hasNextLine()) {
            userParty = scan.nextLine();
            if (userParty.equals("D")) {
                System.out.println("You get a Democratic donkey.");
            }
            else if (userParty.equals("R")) {
                System.out.println("You get a Republican elephant.");
            }
            else if (userParty.equals("I")) {
                System.out.println("You get an independent person.");
            }
            else {
                System.out.println("You inputted an invalid option. Please put the corresponding, capitalized letter for the party next time.");
                System.exit(0);
            }
        }
        else {
            System.out.println("You inputted an invalid data type. Please input a letter next time.");
            System.exit(0);
        }
    }
}
