import java.util.*;
class Calculator
{
    public static void main(String [] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a : ");
        a=sc.nextInt();
        System.out.println("Enter value of b : ");
        b=sc.nextInt();
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction ");
        System.out.println("3 - Multiplication ");
        System.out.println("4 - Division ");
        System.out.println("5 - Remainder ");
        System.out.println("Enter choice : ");
        int operator=sc.nextInt();
        switch(operator)
        {
            case 1:
                System.out.println("Sum is"+(a+b));
                break;
            case 2:
                System.out.println("Difference is"+(a-b));
                break;
            case 3:
                System.out.println("Multiplication is"+(a*b));
                break;
            case 4:
                if(b==0)
                {
                    System.out.println("Invalid division");
                }
                else 
                {
                    System.out.println("Division is"+(a/b));

                }
                break;
            case 5:
                if(b==0)
                {
                    System.out.println("Invalid division");
                }
                else
                {
                    System.out.println("Remainder is"+(a%b));
                }
                break;
            default:
                System.out.println("Invalid choice");
            }
        }
    }
