package com.company;
import java.util.Scanner;
public class Switch_case_02
{
    public static void main(String args[])
    {
        System.out.println("Your Age 18 Or 17 ?");
        Scanner an=new Scanner(System.in);
        int age=an.nextInt();



        switch (age)
        {
            case 18:
                System.out.println("www.Facebook.com");
                break;
            case 17:
                System.out.println("www.Instgram.com");
                break;
            default:
                System.out.println("www.Google.com");

        }
    }
}
