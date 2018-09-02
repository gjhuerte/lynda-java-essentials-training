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
            System.out.println(errorMessage(input1));
        }

        try {
            parsedInput2 = Double.parseDouble(input2);
        }

        catch (NumberFormatException e) {
            noErrorsFound = false;
            System.out.println(errorMessage(input2));
        }

        if(noErrorsFound) {
            chooseOperation(operation, parsedInput1, parsedInput2);
        }
    }

    public static String displayAnswerMessage(String output) {
        StringBuilder answer = new StringBuilder();
        answer.append("The answer is ")
                .append(output);

        return answer.toString();
    }

    public static String displayAnswerMessage(double output) {
        StringBuilder answer = new StringBuilder();
        answer.append("The answer is ")
                .append(output);

        return answer.toString();
    }

    public static String errorMessage(String label) {
        StringBuilder errorOutput = new StringBuilder();
        errorOutput.append("Number formatting exception for input string: \"")
                .append(label)
                .append("\"");

        return errorOutput.toString();
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
                operationResult = displayAnswerMessage(output);
                break;
            case "-":
                output = subtract(input1, input2);
                operationResult = displayAnswerMessage(output);
                break;
            case "*":
                output = multiply(input1, input2);
                operationResult = displayAnswerMessage(output);
                break;
            case "/":
                output = divide(input1, input2);
                operationResult = displayAnswerMessage(output);
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
