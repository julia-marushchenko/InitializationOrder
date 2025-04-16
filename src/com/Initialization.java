// Java program to demonstrate initialization order
package com;

// Initialization class
public class Initialization {

    static int index = callMe(1);
    int index1 = callMe(2);

    public Initialization(){
        callMe(3);
    }

    {
        callMe(4);
    }

    static {
        callMe(5);
    }

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
