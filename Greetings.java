//print hello for 1, namaste for 2, bonjour for 3.
import java.util.*;
public class Greetings
{
    public static void main(String [] args)
    {
        int button;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a button : ");
        button=sc.nextInt();
        switch(button)
        {
        case 1:
            System.out.println("Hello");
            break;
        case 2:
            System.out.println("Namaste");
            break;
        case 3:
            System.out.println("Bonjour");
            break;
        default:
            System.out.println("Invalid Button");
        }
    }
}