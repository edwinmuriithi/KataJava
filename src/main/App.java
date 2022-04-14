package main;

import java.util.Scanner;

public class App {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = in.nextLine();

        //to find the position of first vowel
        int i;
        for(i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                break; //means vowel is found at i
        }

        String f = s.substring(i) + s.substring(0,i) + "ay";

        System.out.println(f);
    }
    }
