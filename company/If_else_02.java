package com.company;

public class If_else_02
{
    public static void main(String[] args)
    {
        int age=17;
    if (18<age)
    {
        System.out.println("Your age 18+");
    }
  /* error thro  else if (18=age)
    {
        System.out.println("Your age ==18");
    } */
    else if(18>age)
    {
        System.out.println("Your age smoll to 18");
    }
    else {
        System.out.println(age);
    }
    }
}
