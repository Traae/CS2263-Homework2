package edu.isu.cs.cs2263.hw02;

import com.google.common.annotations.VisibleForTesting;

public class Driver {
    public static void main (String[] args){
        // print statements for testing the tokenizer

        String str = "Hello World. This is a for-testing-string.";

        System.out.println("Beginning Experiment \n");
        System.out.println("The current string is: " + str);
        System.out.println("Using a space as delimiter");
        Library l = new Library(str, " ");
        System.out.println("First Token: " + l.nextToken());
        System.out.println("Second Token: " + l.nextToken());
        System.out.println("Third Token: " + l.nextToken());
        System.out.println("Conducting pushback of third token.");
        l.pushback();
        System.out.println("Fourth Token: " + l.nextToken());
        System.out.println("The string is now: " + l.getStr());

    }
}
