package com.company;
import java.util.Scanner;
public class If_else_08
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter sub1 marks");
        byte a=sc.nextByte();

        System.out.println("Enter sub2 marks");
        byte b=sc.nextByte();

        System.out.println("Enter sub3 marks");
        byte c=sc.nextByte();

        float avg=(a+b+c)/3.0f;

        System.out.println("overall mark is = " + avg);

        if(avg>=40 && a>=33 && b>=33 && c>=33)
        {
            System.out.println("Your Pass in Exam");
        }
        else
        {
            System.out.println("You are not pass in Exam");
        }
    }
}
