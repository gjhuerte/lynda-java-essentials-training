package com.example.java;

public class Main {

    public static void main(String[] args) {
//        primitiveValuesWrappedInObjects();
//        passingPrimitiveValues();
        objectVariablesAsReference();
    }

    public static void objectVariablesAsReference() {
        String original = "Original!";
        System.out.println("Original before: " + original);
        changeString(original);
        System.out.println("Original after: " + original);
    }

    public static void changeString(String inMethod) {
        inMethod = "New!";
        System.out.println("In method: " + inMethod);
    }

    public static void increment(int[] inMethod) {
        inMethod[0] ++;
        System.out.println("In method: " + inMethod[0]);
    }

    public static void primitiveValuesWrappedInObjects() {
        int[] original = {10, 20, 30};
        System.out.println("Original Value: " + original[0]);
        increment(original);
        System.out.println("Original after: " + original[0]);
    }

    public static void passingPrimitiveValues() {
        int original = 10;
        System.out.println("Original Value: " + original);
        increment(original);
        System.out.println("Original after: " + original);
    }

    public static void increment(int inMethod) {
        inMethod ++;
        System.out.println("In method: " + inMethod);
    }
}
