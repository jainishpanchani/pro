package com.company;

public class Method_Overloding_01
{
    static void foo()
    {
        System.out.println("good morning Bro");
    }

    static void foo(int a)
    {
        System.out.println("Good Morning" + a +"Bro");
    }

    static void foo(int a,int b)
    {
        System.out.println("Good Morning Bro "+a +"bro "+b);
    }

    public static void main(String args[])
    {
        foo();
        foo(3000);
        foo(4000,6000);

    }
}
