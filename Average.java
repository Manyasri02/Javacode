//Enter 3 numbers from the users and make a function to print the average.
import java.util.*;
public class Average{
    public static float average(int a , int b, int c)
    {
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number");
        int c=sc.nextInt();
        float avg=average(a,b,c);
        System.out.println("Average is = "+avg);
    }
}