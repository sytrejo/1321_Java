package edu.KSU;

// Program Lab1A
// Demonstrate the difference between print and println.
public class Lab1A {
    // Prints two lines of output representing a rocket countdown.
    public static void main(String[] args) {
        System.out.print("Three... ");
        System.out.print("Two... ");
        //Line 11 was missing a semi-colon
        System.out.print("One... ");
        System.out.print("Zero... ");
        System.out.println("Liftoff!"); // appears on first line
        System.out.println("Houston, we have a problem.");
    }
}

