package ru.mirea.gibo01.pr1;

import java.lang.*;

public class Ball {
    private String brand;
    private int size;

    public Ball(String b, int s) {
        brand = b;
        size = s;
    }
    public Ball(String b) {
        brand = b;
        size = 0;
    }
    public Ball(){
        brand = "Afs";
        size = 0;
    }

    public void setAge(int size) {
        this.size = size;
    }

    public void setName(String brand) {
        this.brand = brand;
    }

    public String getName(String brand) {
        return brand;
    }

    public int getAge() {
        return size;
    }

    public String toString() {
        return this.brand+", size "+this.size;
    }

    public void intoHumanAge(){
        System.out.println(brand+"'s balls is "+size+" size");
    }
}
