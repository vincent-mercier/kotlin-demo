package com.example.demo.controllers

import com.example.demo.ShapeRandomizerKt
import com.example.demo.kotlindomain.Shape
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.streams.toList

@RestController
class ShapeControllerKt {
    @GetMapping(path = ["/kt/shapes"])
    fun getShapes(@RequestParam minArea: Double?, @RequestParam minPerimeter: Double?): List<Shape> =
            getSomeShapes(20)
                    .stream()
                    .filter { minArea == null || it.area >= minArea }
                    .filter { minPerimeter == null || it.perimeter >= minPerimeter }
                    .toList()

    @GetMapping(path = ["/kt/shapes/color/{color}"])
    fun getShapes(@PathVariable color: String, @RequestParam minArea: Double?, @RequestParam minPerimeter: Double?): List<Shape> =
        getSomeShapes(20)
                .stream()
                .filter { shape: Shape -> shape.color == color }
                .filter { minArea == null || it.area >= minArea }
                .filter { minPerimeter == null || it.perimeter >= minPerimeter }
                .toList()

    private fun getSomeShapes(size: Int): List<Shape> {
        val shapes = mutableListOf<Shape>()

        for (i in 0 until size) {
            shapes.add(ShapeRandomizerKt.makeShape())
        }

        return shapes
    }
}