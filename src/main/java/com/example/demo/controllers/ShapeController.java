package com.example.demo.controllers;

import com.example.demo.ShapeRandomizer;
import com.example.demo.javadomain.Shape;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ShapeController {

    @GetMapping(path = "/shapes")
    List<Shape> getShapes(@RequestParam Double minArea, @RequestParam Double minPerimeter) {
        return getSomeShapes(20)
                .stream()
                .filter(shape -> minArea == null || shape.getArea() >= minArea)
                .filter(shape -> minPerimeter == null || shape.getPerimeter() >= minPerimeter)
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/shapes/color/{color}")
    List<Shape> getShapes(@PathVariable String color, @RequestParam Double minArea, @RequestParam Double minPerimeter) {
        return getSomeShapes(20)
                .stream()
                .filter(shape -> shape.getColor().equals(color))
                .filter(shape -> minArea == null || shape.getArea() >= minArea)
                .filter(shape -> minPerimeter == null || shape.getPerimeter() >= minPerimeter)
                .collect(Collectors.toList());
    }

    private List<Shape> getSomeShapes(int size) {
        List<Shape> shapes = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            shapes.add(ShapeRandomizer.makeShape());
        }

        return shapes;
    }
}
