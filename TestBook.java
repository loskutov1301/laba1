package ru.mirea.gibo01.pr1;

import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Tolstoy", 500);
        Book d2 = new Book("Dostoevsky", 235);
        Book d3 = new Book("Turgenev", 300);
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
