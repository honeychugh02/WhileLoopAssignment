import java.util.Scanner;

public class WhileLoopPracticeQues4 {
    public static void main(String[] args) {
        int num;
        int sumOdd=0;
        int sumEven=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a value till which you want the sum: ");
        num=scanner.nextInt();

        while(num!=0)
        {
            if(num%2==0)
            {
                sumEven=sumEven+num;
                num--;
            }
            else {
                sumOdd=sumOdd+num;
                num--;
            }
        }
        System.out.println("Sum of even numbers is: " + sumEven);
        System.out.println("Sum of odd numbers is: " + sumOdd);


    }
}
