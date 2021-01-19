package com.company;

public class Method_01
{
    static int sum(int x,int y)
    {
        int z;
        z=x+y;

        return z;
    }

    public static void main(String args[])
    {

        int a=10; int b=20;
        int c=a+b;
        System.out.println(c);

        int a1=6;
        int a2=6;
        int bs;
        bs=sum(a1,a2);
        System.out.println(bs);
    }

}
