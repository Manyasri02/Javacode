//Find the factorial of a number.
import java.util.*;
public class Fact
{
    public static void factorial(int a)
    {
        int n=1;
        for(int i=a;i>=1;i--)
        {
            n=n*i;    
        }
        System.out.println(n);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        factorial(a);
    }
}