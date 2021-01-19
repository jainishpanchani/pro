package com.company;
import java.util.Scanner;
public class If_else_03
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int a=sc.nextInt();
        if(18<a)
        {
            System.out.println("Yes can Drive");
        }
        else
        {
            System.out.println("You can not drive");
        }
    }
}
