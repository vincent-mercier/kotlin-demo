package com.example.demo.javadomain;

public class Rectangle implements Shape {
    private final double width;
    private final double height;
    public final String color;

    public Rectangle(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public String getColor() { return color; }

    @Override
    public double getArea() { return width * height; }

    @Override
    public double getPerimeter() { return 2 * width + 2 * height; }
}
