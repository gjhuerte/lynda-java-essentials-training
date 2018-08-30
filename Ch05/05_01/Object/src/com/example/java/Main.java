package com.example.java;

public class Main {

    // instance variable
    public String type;
    char[] chars = {'H', 'E', 'L', 'L', 'O', '!'};

    // static method
    public static void main(String[] args) {

        //instantiation
        Main main = new Main();
        main.type = "Hat";
        main.displayItem();
        main.displayHello();

    }

    // instance method
    public void displayItem() {
        System.out.println("This is a " + this.type);
    }

    public void displayHello() {
        String s = new String(this.chars);
        System.out.println(s);
    }
}
