package com.javalesson.controlStatement;

public class SwitchCase {
    public static void main(String[] args) {
        String dayOfTheWeek = args[0];
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("You chose first working day.");
                break;
            case "tuesday":
                System.out.println("You chose second working day.");
                break;
            case "wednesday":
                System.out.println("You chose third working day.");
                break;
            case "thursday":
                System.out.println("You chose fourth working day.");
                break;
            case "friday":
                System.out.println("You chose fifth working day.");
                break;
            case "saturday":
            case "sunday":
                System.out.println("You chose weekend day.");
                break;
            default:
                System.out.println("Not a day of the week.");
        }
        System.out.println("Final string.");
    }
}
