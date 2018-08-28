package com.example.java;

/**
 * Created by Gabriel on 28/08/2018.
 */
public class MaxValues {

    public static void main(String[] args) {

        byte b = 127;
        System.out.println("Byte: " + b);

        /**
         * Byte is helper class for byte values
         * has contant/static field called MAX_VALUE
         * MAX_VALUE is the largest value the data type
         * can have
         */
        if (b < Byte.MAX_VALUE) {
            b++;
        }

        System.out.println("Byte: " + b);
    }
}
