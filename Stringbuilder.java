import java.util.*;
public class Stringbuilder
{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert
        sb.insert(0, 'S');
        System.out.println(sb);

        //delete the extra 'n'
        sb.delete(2,4);
        System.out.println(sb);

        //append
        StringBuilder s= new StringBuilder("h");
        s.append("e");
        s.append("l");
        s.append("l");
        s.append("o");
        System.out.println(s);
        System.out.println(s.length());

        //Reverse a string
        for(int i=0; i<s.length()/2; i++)
        {
            int front = i;
            int back = s.length()-1-i; //5-1-0=>4

            char frontChar = s.charAt(front);
            char backChar = s.charAt(back);

            s.setCharAt(front, backChar);
            s.setCharAt(back, frontChar);
        }

        System.out.println(s);
    }
}