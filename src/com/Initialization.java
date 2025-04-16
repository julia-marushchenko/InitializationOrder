// Java program to demonstrate initialization order
package com;

// Initialization class
public class Initialization {

    // Static class' field
    static int index = callMe(1);
    // Class' field
    int index1 = callMe(2);

    // Constructor
    public Initialization(){
        callMe(3);
    }

    // Initialization block
    {
        callMe(4);
    }

    // Static block
    static {
        callMe(5);
    }

    // Method to print integer number and return it
    public static int callMe(int number){
        System.out.println(number);
        return number;
    }

    // Method main to run java program
    public static void main(String[] args) {

        // Instance of class Initialization
        Initialization initialization = new Initialization();
    }
}
