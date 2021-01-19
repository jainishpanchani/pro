package com.company;

public class Method_02
{
    static int add (int q,int w)
    {
        int e;
        e=q+w;
        return e;
    }
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);

        int x=60;
        int y=40;
        int z;
        z=add(x,y);
        System.out.println(z);
    }
}
