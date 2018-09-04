package com.example.java;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File sourceFile = new File("files/loremipsum.txt");
        File targetFile = new File("files/target.txt");

        try {
            FileUtils.copyFile(sourceFile, targetFile);
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
