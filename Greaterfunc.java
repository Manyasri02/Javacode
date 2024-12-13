//Write a Function which takes in 2 numbers and returns the greater  of those two.
import java.util.*;
public class Greaterfunc{
    public static void Greater(int a, int b)
    {
        if(a==b)
        {
            System.out.println("Numbers are equal");
        }
        else if(a<b)
        {
        System.out.println("b is greater than a");
        }
        else
        {
            System.out.println("a is greater than b");
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number(a) : ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number(b) : ");
        int b=sc.nextInt();
        Greater(a,b);
    }    
}