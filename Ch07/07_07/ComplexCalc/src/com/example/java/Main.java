package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input1 = getInput("Enter a numeric value: ");
        String input2 = getInput("Enter a numeric value: ");
        String operation = getInput("Choose an operation (+ - * /): ");
        double parsedInput1 = 0;
        double parsedInput2 = 0;
        boolean noErrorsFound = true;

        try {
            parsedInput1 = Double.parseDouble(input1);
        }

        catch (NumberFormatException e) {
            noErrorsFound = false;
            System.out.println("Number formatting exception for input string: \"" + input1 +"\"");
        }

        try {
            parsedInput2 = Double.parseDouble(input2);
        }

        catch (NumberFormatException e) {
            noErrorsFound = false;
            System.out.println("Number formatting exception for input string: \"" + input2 +"\"");
        }

        if(noErrorsFound) {
            chooseOperation(operation, parsedInput1, parsedInput2);
        }
    }

    public static String getInput(String label) {
        System.out.print(label);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void chooseOperation(String operation, double input1, double input2) {
        double output = 0;
        String operationResult = "";

        switch (operation) {
            case "+":
                output = add(input1, input2);
                operationResult = "The answer is " + output;
                break;
            case "-":
                output = subtract(input1, input2);
                operationResult = "The answer is " + output;
                break;
            case "*":
                output = multiply(input1, input2);
                operationResult = "The answer is " + output;
                break;
            case "/":
                output = divide(input1, input2);
                operationResult = "The answer is " + output;
                break;
            default:
                operationResult = "Unrecognized operation!";
        }

        System.out.println(operationResult);
    }

    public static double add(double input1, double input2) {
        return input1 + input2;
    }

    public static double subtract(double input1, double input2) {
        return input1 - input2;
    }

    public static double multiply(double input1, double input2) {
        return input1 * input2;
    }

    public static double divide(double input1, double input2) {
        return input1 / input2;
    }
}
