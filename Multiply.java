//Make a function to add 2 numbers and display its product.
import java.util.*;
public class Multiply{
    public static int product(int a , int b)
    {
        int mul=a*b;
        return mul;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        int mul=product(a,b);
        System.out.println("Product is ="+mul);
    }
}