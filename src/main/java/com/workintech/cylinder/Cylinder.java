package com.workintech.cylinder;

// Circle sınıfından kalıtım alınıyor
public class Cylinder extends Circle {
    private double height; // height değişkeninin tipi double olmalı

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius); // Circle sınıfının constructor'ını çağırır
        if (height < 0) {
            this.height = 0; // Eğer height 0'dan küçükse 0'a eşitlenir
        } else {
            this.height = height;
        }
    }

    // Height değerini dönen metot
    public double getHeight() {
        return height;
    }

    // Hacmi hesaplayan metot
    public double getVolume() {
        return getArea() * height; // getArea(), Circle sınıfından gelir
    }
}
