package com.example.java.model;

public abstract class Olive {

    private OliveName name = OliveName.KALAMATA;
    private OliveColor color = OliveColor.PURPLE;
    private int oil = 3;

    public Olive(OliveName name, OliveColor color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    public int crush() {
        String msg = name + ", from " + getOrigin() + ": " + oil + " units";
        System.out.println(msg);
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public abstract String getOrigin();

    @Override
    public String toString() {
        return name.toString();
    }
}
