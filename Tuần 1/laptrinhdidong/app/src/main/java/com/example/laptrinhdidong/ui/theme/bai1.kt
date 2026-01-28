package com.example.laptrinhdidong


fun main() {
    println("Hello, world!")
    println("This is the text to print!")

    val age = "5"
    val name = "Rover"

    var roll = 6
    var rolledValue: Int = 4

    println("You are already $age!")
    println("You are already $age days old, $name!")

    printHello()
    printBorder("*", 10)

    val result = rollDice()
    println("Dice rolled: $result")

    val num = 4
    if (num > 4) {
        println("The variable is greater than 4")
    } else if (num == 4) {
        println("The variable is equal to 4")
    } else {
        println("The variable is less than 4")
    }

    val luckyNumber = 6
    when (result) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("No luck! You rolled a 4. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
    }

    printSimpleBorder()
    printCakeBottom(age.toInt(), 3)

    var i = 1
    while (i <= 5) {
        println("$i! = ${factorial(i)}")
        i++
    }

    val myFirstDice = Dice(6)
    println("Dice class roll: ${myFirstDice.roll()}")
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

fun printSimpleBorder() {
    repeat(23) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

fun factorial(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
