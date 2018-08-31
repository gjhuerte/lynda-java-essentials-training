package com.example.java;

import java.util.Scanner;

public class Main {

    public static double firstInput;
    public static double secondInput;

    public static void main(String[] args) {
        Main main = new Main();
        main.firstInput = main.getUserInput();
        main.secondInput = main.getUserInput();
        Double sum = main.add(firstInput, secondInput);
        System.out.println("The answer is " + sum);
    }

    public double getUserInput() {
        System.out.print("Enter a numeric value: ");
        Scanner input = new Scanner(System.in);
        String returnValue = input.nextLine();
        Double parsedDouble = new Double(returnValue);
        return parsedDouble;
    }

    public double add(Double first, Double second) {
        return first + second;
    }
}
