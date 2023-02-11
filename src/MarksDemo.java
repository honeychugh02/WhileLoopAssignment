import java.util.Scanner;

public class MarksDemo
{
    public static void main(String[] args) {
        double marks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your marks: ");
        marks=scanner.nextDouble();

        if(marks<40)
        {
            System.out.println("You have to work harder!");
        }

        else if(marks>=40 && marks<60)
        {
            System.out.println("Good");
        }

        else if(marks>=60 || marks<=70)
        {
            System.out.println("Very Good");
        }

        else if(marks>70 && marks<=90)
        {
            System.out.println("Excellent");
        }
        else
        {
        System.out.println("You are a champion!");
        }
    }
}
