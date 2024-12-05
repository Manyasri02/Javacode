//Write a  function  that takes radius as input and returns the circumference of the circle.
import java.util.*;
public class Circumference
{
    public static double Circumference(int r)
    {
        double x=2*3.14*r;
        System.out.println("Circumference is : "+ x);
        return x;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        int r=sc.nextInt();
        System.out.println(Circumference(r));
    }
}