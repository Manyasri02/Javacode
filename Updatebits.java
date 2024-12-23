//Update 2nd bit(position =1) of a number n to 1.(n=0101)
import java.util.*;
public class Updatebits
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1 : set oper=) : clear
        int n=5;//0101
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper ==1)
        {
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }    
    }
}