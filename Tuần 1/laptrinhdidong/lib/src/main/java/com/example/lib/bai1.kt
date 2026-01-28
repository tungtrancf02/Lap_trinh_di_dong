package com.example.lib
fun main() {
    println("Hello, world!")

    println("This is the text to print!")

    val age = "5"
    val name = "Rover"

    println("You are already ${age}!")
    println("You are already ${age} days old, ${name}!")

    printHello()
    printBorder("*", 10)

    val result = rollDice()
    println("Dice rolled: $result")
}

fun printHello() {
    println("Hello Kotlin")
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun rollDice(): Int {
    return (1..6).random()
}


