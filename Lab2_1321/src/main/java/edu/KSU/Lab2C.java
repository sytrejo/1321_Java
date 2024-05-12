package edu.KSU;
import java.util.Scanner;

public class Lab2C {

    public static void main(String[] args){
        int width, height, area, perimeter;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a width: ");
        width = Integer.parseInt(sc.nextLine());

        System.out.print("Enter a height: ");
        height = Integer.parseInt(sc.nextLine());

        area = width * height;
        perimeter = 2 * (height + width);

        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);

    }
}
