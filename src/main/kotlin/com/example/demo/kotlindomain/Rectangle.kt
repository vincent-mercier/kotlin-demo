package com.example.demo.kotlindomain

open class Rectangle(val width: Double, val length: Double, override val color: String? = null): Shape {
    override val area: Double
        get() = width * length

    override val perimeter: Double
        get() = 2 * width + 2 * length
}