package edu.KSU;

import java.util.Scanner;

public class Lab4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score of your exam: ");

        double grade = sc.nextDouble();

        //are my upper bounds correct?
        if (grade >= 98.00) {
            System.out.print("Letter grade is: A+");
        } else if (grade >= 95.00 && grade < 98.00) {
            System.out.print("Letter grade is: A");
        } else if (grade >= 92.00 && grade < 95.00) {
            System.out.println("Letter grade is: A-");
        } else if (grade >= 89.00 && grade < 92.00) {
            System.out.print("Letter grade is: B+");
        } else if (grade >= 86.00 && grade < 89.00) {
            System.out.print("Letter grade is: B");
        } else if (grade >= 83.00 && grade < 86.00) {
            System.out.print("Letter grade is: B-");
        } else if (grade >= 80.00 && grade < 83.00) {
            System.out.print("Letter grade is: C+");
        } else if (grade >= 77.00 && grade < 80.00) {
            System.out.print("Letter grade is: C");
        } else if (grade >= 74.00 && grade < 77.00) {
            System.out.print("Letter grade is: C-");
        } else if (grade >= 71.00 && grade < 74.00) {
            System.out.println("Letter grade is: D+");
        } else if (grade >= 68.00 && grade < 71.00) {
            System.out.print("Letter grade is: D");
        } else if (grade >= 65.00 && grade < 68.00) {
            System.out.print("Letter grade is: D-");
        } else if (grade >= 0.00 && grade < 65.00) {
            System.out.print("Letter grade is: F");
        }
    }
}

