package com.company;
import java.util.Scanner;
public class For_loop_02
{
    public static void main(String args[])
    {
        Scanner fl=new Scanner(System.in);
        System.out.println("Enter Lopp Number");
        int a=fl.nextInt();

        for(int i=1; i<=a; i++)
        {
            System.out.println(i);
        }
    }
}

