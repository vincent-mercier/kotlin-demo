package com.example.demo;

import com.example.demo.javadomain.Circle;
import com.example.demo.javadomain.Rectangle;
import com.example.demo.javadomain.Shape;
import com.example.demo.javadomain.Square;

public class ShapeRandomizer {
    private static final String[] colors = new String[] {"Red", "Green", "Blue"};

    public static Shape makeShape() {
        int shape = (int) Math.floor(Math.random() * 3);

        switch (shape) {
            case 0:
                return new Circle(Math.random() * 20, colors[(int) Math.floor(Math.random() * 3)]);
            case 1:
                return new Rectangle(
                        Math.random() * 20,
                        Math.random() * 20, colors[(int) Math.floor(Math.random() * 3)]
                );
            case 2:
                return new Square(Math.random() * 20, colors[(int) Math.floor(Math.random() * 3)]);
            default:
                throw new RuntimeException("Not allowed here");
        }
    }
}
