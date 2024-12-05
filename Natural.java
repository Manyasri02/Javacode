import java.util.*;
public class Natural
{
    public static void main(String [] args)
    {
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n=sc.nextInt();
        for(i=0;i<n+1;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum is : "+sum);
    }
}