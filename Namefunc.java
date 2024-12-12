//Print a given name in a function
import java.util.*;

public class Namefunc
{
    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("input name");
        String name=sc.next();
        printMyName(name);
    }
}