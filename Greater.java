import java.util.*;
public class Greater
{
    public static void main(String [] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a : ");
        a=sc.nextInt();
        System.out.println("Enter value of b : ");
        b=sc.nextInt();
        if(a==b)
        {
            System.out.println("Numbers are equal");
        }
        else if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
            System.out.println("b is greater than a");
        }
    }
}
