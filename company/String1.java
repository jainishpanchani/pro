package com.company;

import java.util.Locale;
import java.util.Scanner;
public class String1
{
    public static void main(String args[])
    {
        String str="Aniruddh Ratanpara";
       // System.out.println(str);
        int values=str.length();
        System.out.println(values);

        String ls=str.toLowerCase();
        System.out.println(ls);

        String us=str.toUpperCase();
        System.out.println(us);

        String trim=str.trim();
        System.out.println(trim);

        System.out.println(str.substring(5));
        String sb=str.substring(9);
        System.out.println(sb);

        System.out.println(str.substring(4,11));
        String sb2=str.substring(2,12);
        System.out.println(sb2);

        System.out.println(str.replace('h','a'));
        System.out.println(str.replace("ddh","dhdh"));

    }
}

