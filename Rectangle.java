/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

/**
 *
 * @author pc
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public double getArea() {
        return this.length * this.width;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(7.0, 4.0);

        System.out.println("Rectangle 1 Perimeter: " + rect1.getPerimeter());
        System.out.println("Rectangle 1 Area: " + rect1.getArea());
        System.out.println("Rectangle 2 Perimeter: " + rect2.getPerimeter());
        System.out.println("Rectangle 2 Area: " + rect2.getArea());
    }
}

