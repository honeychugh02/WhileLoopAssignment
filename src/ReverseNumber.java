import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num;
        int rev=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a number");
        num=scanner.nextInt();

        while(num!=0)
        {
            rev=(rev*10) + (num%10);
            num=num/10;
        }
        System.out.println("Reverse of the given number is: " + rev);
    }
}
