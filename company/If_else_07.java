package com.company;
import java.util.Scanner;
public class If_else_07
{
    public static void main(String args[])
    {
        System.out.println("Enter Youe Age => ");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        if(n>18)
        {
            System.out.println("Java Python");
        }
        else if(n>16)
        {
            System.out.println("PHP JavaScript");
        }
        else if(n>14)
        {
            System.out.println("HTML CSS");
        }
        else
        {
            System.out.println("C C++");
        }
    }
}
