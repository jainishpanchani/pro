package com.company;
import java.util.Scanner;
public class Aniruddh_2
{
    public static void main(String[] args)
    {
        Scanner exam=new Scanner(System.in);
        System.out.println("Enter Sub Marks");

        System.out.println("Sub => 1 ");
        int s1=exam.nextInt();
        System.out.println("Sub => 2 ");
        int s2=exam.nextInt();
        System.out.println("Sub => 3 ");
        int s3=exam.nextInt();
        System.out.println("Sub => 4 ");
        int s4=exam.nextInt();
        System.out.println("Sub => 5 ");
        int s5=exam.nextInt();
        System.out.println("Sub => 6 ");
        int s6=exam.nextInt();
        double total=s1+s2+s3+s4+s5+s6;

        System.out.println(total/6);

    }
}
