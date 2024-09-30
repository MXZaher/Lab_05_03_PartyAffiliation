import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        System.out.print("Please enter your political party (R, D, I): ");
        Scanner in = new Scanner(System.in);
        String party = in.next();
        switch(party)
        {
            case "R":
                System.out.print("You get a Republican Elephant");
                break;
            case "D":
                System.out.print("You get a Democrat Donkey");
                break;
            case "I":
                System.out.print("You are an Independent");
                break;
            default:
                System.out.print("You did not chose a party affiliation");
                break;
        }

    }
}
