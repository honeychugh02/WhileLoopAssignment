import java.util.Scanner;
public class WhileLoopPracticeQues5 {
        public static void main(String[] args) {
            int x;
            int y=0;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter a number: ");
            x=scanner.nextInt();

            while(x>0)
            {
                //y=x;
                y=y+x;
                x=scanner.nextInt();
            }
            System.out.println("Sum of all numbers entered is:" + y);
        }
    }

