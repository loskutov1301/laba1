package ru.mirea.gibo01.pr1;
import java.lang.*;
public class Sofa {
    private double length;
    private double height;
    private double widht;
    private String color;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sofa(double length, double height, double widht, String color) {
        this.length = length;
        this.height = height;
        this.widht = widht;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "length=" + length +
                ", height=" + height +
                ", widht=" + widht +
                ", color='" + color + '\'' +
                '}';
    }
}
