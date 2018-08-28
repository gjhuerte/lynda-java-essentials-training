package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd value is " + intValue2);

        /**
         * Widening the type
         * Automatic
         * From shorter to longer
         */
        long longValue1 = intValue1;
        System.out.println("The long value is " + longValue1);

        /**
         * Narrowing the type
         *
         */
        short shortValue1 = (short) intValue1;
        System.out.println("The short value is " + shortValue1);

        /**
         * Narrowing type
         */
        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is " + byteValue);

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Double to int: " + intValue4);

    }
}
