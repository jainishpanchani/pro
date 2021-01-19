package com.company;
import java.util.Scanner;
public class Pro7
{
    public static void main(String args[])
    {
        System.out.println("Enter Number Get Input And print data");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number 1");
        int x=sc.nextInt();
        System.out.println("Enter Number 2");
        int y=sc.nextInt();
        System.out.println("Enter Number 3");
        int z=sc.nextInt();

        int sum=x+y+z;
        System.out.println(sum);
    }
}
