package com.company;
import java.util.Scanner;
public class Switch_case_01
{
    public static void main(String args[])
    {
        System.out.println("Enter Your Age =>");
        Scanner sc=new Scanner(System.in);

       int age=sc.nextInt();

        switch(age)
        {
            case 24:
                System.out.println("filehorse Software");
                break;
            case 18:
                System.out.println("filehippo Software");
                break;
            case 16:
                System.out.println("Enjoy Life");
                break;

        }

    }
}
