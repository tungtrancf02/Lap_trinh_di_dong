package com.example.laptrinhdidong.ui.theme



import kotlin.math.PI

fun main() {

    val squareCabin = SquareCabin(6, 50.0)
    val roundHut = RoundHut(3, 10.0)
    val roundTower = RoundTower(4, 15.5, 2)

    val dwellings = listOf(squareCabin, roundHut, roundTower)

    for (dwelling in dwellings) {
        with(dwelling) {
            println("Material: $buildingMaterial")
            println("Capacity: $capacity")
            println("Floor area: ${floorArea()}")
            println("Has room? ${hasRoom()}")
            println()
        }
    }

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(numbers.size)
    println(numbers[0])
    println(listOf("red", "blue", "green").reversed())

    val entrees = mutableListOf<String>()
    entrees.add("spaghetti")
    entrees[0] = "lasagna"
    entrees.remove("lasagna")

    for (item in numbers) {
        println(item)
    }

    var index = 0
    while (index < numbers.size) {
        println(numbers[index])
        index++
    }

    val name = "Android"
    println(name.length)

    val number = 10
    val groups = 5
    println("$number people")
    println("${number * groups} people")

    var a = 10
    var b = 5
    a += b
    a -= b
    a *= b
    a /= b
    println(a)

    addToppings("Cheese", "Olives", "Mushrooms")
}

/* ===== ABSTRACT CLASS ===== */

abstract class Dwelling(val residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int
    abstract fun floorArea(): Double

    fun hasRoom(): Boolean {
        return residents < capacity
    }
}

/* ===== INHERITANCE ===== */

open class RoundHut(
    residents: Int,
    val radius: Double
) : Dwelling(residents) {

    override val buildingMaterial = "Straw"
    override val capacity = 4

    override fun floorArea(): Double {
        return PI * radius * radius
    }
}

class SquareCabin(
    residents: Int,
    val sideLength: Double
) : Dwelling(residents) {

    override val buildingMaterial = "Wood"
    override val capacity = 6

    override fun floorArea(): Double {
        return sideLength * sideLength
    }
}

class RoundTower(
    residents: Int,
    radius: Double,
    val floors: Int
) : RoundHut(residents, radius) {

    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors

    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}

/* ===== VARARG ===== */

fun addToppings(vararg toppings: String) {
    for (topping in toppings) {
        println(topping)
    }
}
