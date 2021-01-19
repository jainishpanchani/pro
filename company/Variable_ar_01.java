package com.company;

public class Variable_ar_01
{
    static int sum(int a,int b)
    {
        return a+b;
    }

    static int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    static int sum(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
    public static void main(String arga[])
    {
        System.out.println("sum 5+6 is = "+sum(5,6));
        System.out.println("sum 9+8+7 is ="+sum(9,8,7));
        System.out.println("sum 10+8+6+12 is ="+sum(10,8,6,12));
    }
}
