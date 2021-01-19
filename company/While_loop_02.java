package com.company;
import java.util.Scanner;
public class While_loop_02
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Loop No.");
        long a=sc.nextLong();

        long i=1;
        while (i<=a)
        {
            System.out.println(i);
            i++;
        }
    }
}
