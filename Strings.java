import java.util.*;

public class Strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //single word 
        //System.out.println("Enter your name : ");
        //String name = sc.next();
        //System.out.println("Your name is : "+ name);

        //more than one word
        System.out.println("Enter your name : ");
        String fullName = sc.nextLine();
        System.out.println("Your full name is : "+ fullName);
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++)
        {
            System.out.println(fullName.charAt(i));
        } 
    }
}