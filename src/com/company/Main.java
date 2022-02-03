package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle1 triangle = new Triangle1();
        triangle.a = 6;
        triangle.b = 7;
        triangle.c = 9;


        System.out.println("The area of triangle is:" + triangle.area());
    }
}
