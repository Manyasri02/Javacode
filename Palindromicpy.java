/*
    1
   212
  32123
 4321234
543212345
*/
import java.util.*;
public class Palindromicpy
{
    public static void main(String args [])
    {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            //spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            //numbers
            //1st half
            for(int j=i; j>=1 ; j--)
            {
                System.out.print(j);
            }
            for(int j=2; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}