import java.sql.SQLOutput;

public class SumOfFirst10Numbers {
    public static void main(String[] args) {
        int x=1;
        int y=2;

        while(y<=10)
        {
            x=x+y;
            y++;
           // System.out.println(x);
        }
        System.out.println("Sum is: " + x);
    }
}
