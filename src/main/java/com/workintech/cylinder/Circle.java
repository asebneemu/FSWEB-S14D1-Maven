package com.workintech.cylinder;

public class Circle {
    private double radius; // radius değişkeninin tipi double olmalı

    // Constructor
    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0; // Eğer radius 0'dan küçükse 0'a eşitlenir
        } else {
            this.radius = radius;
        }
    }

    // Radius değerini dönen metot
    public double getRadius() {
        return radius;
    }

    // Alanı hesaplayan metot
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
