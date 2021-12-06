package ru.mirea.gibo01.pr1;

import java.lang.*;

public class Book {
    private String author;
    private int volume;

    public Book(String a, int v) {
        author = a;
        volume = v;
    }
    public Book(String a) {
        author = a;
        volume = 0;
    }
    public Book() {
        author = "Tol";
        volume = 0;
    }

    public void setAge(int volume) {
        this.volume = volume;
    }

    public void setName(String author) {
        this.author = author;
    }

    public String getName(String author) {
        return author;
    }

    public int getAge() {
        return volume;
    }

    public String toString() {
        return this.author +", volume "+this.volume;
    }

    public void intoHumanAge(){
        System.out.println(author +"'s books have got "+ volume +" pages");
    }
}
