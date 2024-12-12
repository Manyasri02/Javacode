//Make a function to add 2 numbers and return the sum.
import java.util.*;
public class Sumfun
{
    public static int sum(int a, int b)
    {
        int add=a+b;
        return add;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st  number : ");
        int a=sc.nextInt();
        System.out.println("enter 2nd number : ");
        int b=sc.nextInt();
        int add=sum(a,b);
        System.out.println("Sum is = "+add);
    }
}