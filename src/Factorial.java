import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        int x;
        int fact=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("PLease enter a value: ");
        x=scanner.nextInt();

        while(x>=1)
        {
         fact=fact*x;
         x--;
        }
        System.out.println("Factorial of given number is " + fact);
    }
}
