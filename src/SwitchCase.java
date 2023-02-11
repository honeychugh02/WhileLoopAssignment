import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        char input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter A for English");
        System.out.println("Please enter B for Spanish");
        System.out.println("Please enter C for French");
        System.out.println("Please enter D for Russian");
        System.out.println("Please enter E for Exit");
        input = scanner.next().charAt(0);

        switch (input)
        {
            case 'A':
                System.out.println("English is selected.");
                break;

            case 'B':
                System.out.println("Spanish is selected.");
                break;

            case 'C':
                System.out.println("French is selected.");
                break;

            case 'D':
                System.out.println("Russian is selected.");
                break;

            case 'E':
                System.out.println("Exit out of code.");
                break;

            default:
                System.out.println("Please enter a valid input.");
        }

    }
}
