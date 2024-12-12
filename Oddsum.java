//Write a function to print tha sum of all odd numbers from 1 to n.
import java.util.*;
public class Oddsum{
    public static int odd(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if (i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println("sum is : "+ sum);
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        odd(n);

    }
}