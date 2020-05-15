package com.example.demo

import com.example.demo.kotlindomain.Circle
import com.example.demo.kotlindomain.Rectangle
import com.example.demo.kotlindomain.Shape
import com.example.demo.kotlindomain.Square
import kotlin.math.floor

object ShapeRandomizerKt {
    private val colors = arrayOf("Red", "Green", "Blue")

    fun makeShape(): Shape {
        val shape = floor(Math.random() * 3).toInt()

        return when (shape) {
            0 -> Circle(Math.random() * 20, colors.random())
            1 -> Rectangle(Math.random() * 20, Math.random() * 20, colors.random())
            2 -> Square(Math.random() * 20, colors.random())
            else -> throw RuntimeException("Not allowed here")
        }
    }
}