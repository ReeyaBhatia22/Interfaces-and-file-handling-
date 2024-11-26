import java.util.Scanner;
public class Main 
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);

        try {
            System.out.println("Enter two numbers"); 
            int x= sc.nextInt();
            int y= sc.nextInt();
            int c= x/y;
            System.out.println(x+"/"+y+"="+c);
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.toString());

        }
        finally {
            System.out.println("---finally---");
            
        }
        System.out.println("---DONE---");
        sc.close();
    }
       
    }


    

