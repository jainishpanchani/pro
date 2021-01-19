import java.util.Scanner;
public class If_else_04
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter User Name:");
        int a=sc.nextInt();
        System.out.println("Enter Password");
        int b=sc.nextInt();

        if(a==b)
        {
            System.out.println("Login Your Id");
        }
        else
        {
            System.out.println("User name and password not same");
        }

    }
}
