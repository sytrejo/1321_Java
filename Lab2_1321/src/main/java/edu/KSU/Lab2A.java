package edu.KSU;

import java.util.Scanner;

public class Lab2A {

    public static void main(String[] args){
        String name1, name2, verb, adverb;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        name1 = sc.nextLine();

        System.out.print("Enter another name: ");
        name2 = sc.nextLine();

        System.out.print("Enter a verb: ");
        verb = sc.nextLine();

        System.out.print("Enter an adverb: ");
        adverb = sc.nextLine();

        System.out.println("Once upon a time, there was a person named " + name1 + " who had a child named " +
                name2 + ". This child would " + verb + " " + adverb + " while singing to strangers.");


    }
}
