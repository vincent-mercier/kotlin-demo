package com.example.demo.kotlindomain

import kotlin.math.pow

class Circle(private val radius: Double, override val color: String? = null) : Shape {
    override val area: Double
        get() = Math.PI * radius.pow(2.0)

    override val perimeter: Double
        get() = 2 * Math.PI * radius
}