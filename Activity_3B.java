import java.util.Scanner;

public class Activity_3B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your civil status (S/M/W/C): ");
        char status = input.next().charAt(0);


        status = Character.toUpperCase(status);

        switch (status) {
            case 'S':
                System.out.println("You are still single!");
                break;
            case 'M':
                System.out.println("You are married!");
                break;
            case 'W':
                System.out.println("You are widowed!");
                break;
            case 'C':
                System.out.println("It's complicated!");
                break;
            default:
                System.out.println("You are still young to be in a relationship!");
        }

        input.close();
    }
}
