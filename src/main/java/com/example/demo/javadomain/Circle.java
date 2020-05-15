package com.example.demo.javadomain;

public class Circle implements Shape {
    public final double radius;
    public final String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() { return this.color; }

    @Override
    public double getArea() { return Math.PI * Math.pow(radius, 2); }

    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
}
