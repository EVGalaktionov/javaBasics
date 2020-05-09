package com.javalesson.controlStatement;

public class Controls {

    public static void main(String[] args) {
        int i = 10;
        {
            int k = 15;
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        }
        int testScore = 76;
        System.out.println("You've got a:");
        if (testScore >= 90) {
            System.out.println("Excellent mark!");
            System.out.println("Congrats!");
        } else if (testScore >= 75) {
            System.out.println("Good mark!");
        } else if (testScore >= 60) {
            System.out.println("Satisfactory mark!");
        } else {
            System.out.println("Bad mark!");
            System.out.println("Good luck next time!");
        }
        System.out.println("Galaktionov E. 21-04-2020");
    }

}
