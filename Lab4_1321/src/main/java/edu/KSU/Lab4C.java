package edu.KSU;

import java.util.Scanner;

public class Lab4C {
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("Please input a number: ");

        double userInput = sc.nextDouble();

        System.out.print("What would you like to do to this number: " + "\n0) Get the additive inverse of the number"
        + "\n1) Get the reciprocal of the number" + "\n2) Square the number" + "\n3) Cube the number" + "\n4) Exit the program");

        int caseSelection = sc.nextInt();

        switch (caseSelection)
        {
            case 0:
                double additiveInvers = userInput * -1;
                System.out.println("The additive inverse of " + userInput + " is " + additiveInvers);
                break;
            case 1:
                double reciprocal = 1.0 / userInput;
                System.out.println("The reciprocal of " + userInput + " is " + reciprocal);
                break;
            case 2:
                double squareUserInput = userInput * userInput;
                System.out.println("The square of " + userInput + " is " + squareUserInput);
                break;
            case 3:
                double cubeUserInput = userInput * userInput * userInput;
                Console.WriteLine("The cube of " + userInput.ToString("F1") + " is " + cubeUserInput.ToString("F1"));
                break;
            case 4:
                Console.WriteLine("Thank you, goodbye!");
                break;
            default:
                Console.WriteLine("Invalid input, please try again!");
                break;
        }

    }
}
