package edu.KSU;

import java.util.Scanner;

public class Lab4B {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");

        String day = sc.nextLine();

        if (day.equals("monday") || day.equals("wednesday"))
        {
            System.out.println("I have class today!");
        }
        else if (day.equals("friday"))
        {
            System.out.println("It's Friday! Friday! Gotta get down on Friday!");
        }
        else
        {
            System.out.println("I should use this time to do my homework.");;
        }

    }
}
