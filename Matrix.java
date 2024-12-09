//Take a matrix from the user.Search for a given number x and print the indices at which it occurs.
import java.util.*;
public class Matrix
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns : ");
        int cols=sc.nextInt();

        int[][] numbers= new int[rows][cols];
        //input
        //rows
        for(int i=0;i<rows;i++) 
        {
            //columns
            for(int j=0;j<cols;j++)
            {
                numbers[i][j]=sc.nextInt();
            }

        }
        
        int x=sc.nextInt();
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                //compare with x
                if(numbers[i][j]==x)
                {
                    System.out.println("x is found at location ("+i+","+j+")");
                }
            }
        }
    }
}