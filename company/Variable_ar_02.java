package com.company;

public class Variable_ar_02
{
    static int sum(int ...arr)
    {
    int result=0;
    for(int a: arr)
    {
        result +=a;
    }
    return result;
    }

    public static void main(String arga[])
    {
        System.out.println("sum 5+6 is = "+sum(5,6));
        System.out.println("sum 9+8+7 is ="+sum(9,8,7));
        System.out.println("sum 10+8+6+12 is ="+sum(10,8,6,12));
        System.out.println("sum 10+8+6+12 is ="+sum(1,10,8,6,12));
    }
}
