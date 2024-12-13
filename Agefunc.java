//Write a function that takes in age as input and returns if that the person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
public class Agefunc
{
    public static void Valid(int age)
    {
        if(age>=18)
        {
            System.out.println("The person is eligible to vote.");
        }
        else
        {
            System.out.println("The person is not eligible to vote.");
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age=sc.nextInt();
        Valid(age);
    } 
}