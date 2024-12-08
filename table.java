import java.util.*;
public class table
{
    public static void main(String [] args)
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for table");
        n=sc.nextInt();
        for(int i = 1;i<11;i++)
        {
            m=n*i;
            System.out.println(n+"*"+i+"="+m);
        }
    }
}