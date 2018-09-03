package com.example.java;

import java.util.Scanner;

import com.example.java.utilities.MathHelper;

public class Main {

    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation (+ - * /): ");

        double result = 0;

        try {
            switch (op) {
                case "+":
                    result = MathHelper.addValues(s1, s2);
                    break;
                case "-":
                    result = MathHelper.subtractValues(s1, s2);
                    break;
                case "*":
                    result = MathHelper.multiplyValues(s1, s2);
                    break;
                case "/":
                    result = MathHelper.divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }
        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }

        System.out.println("The answer is " + result);
    }

    public static String getInput(String label) {
        System.out.print(label);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
