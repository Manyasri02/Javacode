//Write a program to enter the numbers till the user wants and at the end it should display the count of positive , negative and zeroes entered.
import java.util.*;
public class InputByUser
{
    public static void main(String args[])
    {
        int zero=0;
        int positive=0;
        int negative=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit till you want to enter the numbers");
        int limit=sc.nextInt();
        System.out.println("Enter the numbers : ");

        for(int i=1;i<=limit;i++)
        {
            int numbers=sc.nextInt();
            if(numbers==0)
            {
                zero=zero+1;
            }
            if(numbers<0)
            {
                negative=negative+1;
            }
            if(numbers>0)
            {
                positive=positive+1;
            }
        }
        System.out.println("The numbers of zeroes entered : "+zero);
        System.out.println("The numbers of negative numbers entered : "+negative);
        System.out.println("The numbers of positive numbers entered : "+positive);
    
    }
}