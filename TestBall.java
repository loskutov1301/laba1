package ru.mirea.gibo01.pr1;

import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Nike", 4);
        Ball d2 = new Ball("Adidas", 5);
        Ball d3 = new Ball("Reebok", 6);
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
