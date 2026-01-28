package com.example.laptrinhdidong.ui.theme



import kotlinx.coroutines.*
import kotlin.random.Random

fun main() = runBlocking {

    val job: Job = GlobalScope.launch {
        val output = getValue()
        println("GlobalScope output: $output")
    }

    delay(500)
    job.cancel()

    val output = getValue()
    println("runBlocking output: $output")

    val deferred = async {
        getValue()
    }
    println("Async output: ${deferred.await()}")

    processValue()

    try {
        riskyOperation()
    } catch (e: Exception) {
        println("Exception caught")
    }

    println(DataProviderManager.data)

    val direction = Direction.NORTH
    when (direction) {
        Direction.NORTH -> println("Going North")
        Direction.SOUTH -> println("Going South")
        Direction.WEST -> println("Going West")
        Direction.EAST -> println("Going East")
    }
}

suspend fun getValue(): Double {
    delay(300)
    return Random.nextDouble(0.0, 100.0)
}

suspend fun processValue() {
    val value = getValue()
    println("Processed value: ${value * 2}")
}

object DataProviderManager {
    val data = "Shared Data"
}

fun riskyOperation() {
    if (Random.nextBoolean()) {
        throw Exception("Random error")
    }
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
