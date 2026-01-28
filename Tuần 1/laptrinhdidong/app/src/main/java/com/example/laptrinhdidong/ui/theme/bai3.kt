package com.example.laptrinhdidong.ui.theme



fun main() {

    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    val setOfNumbers = numbers.toSet()
    println(setOfNumbers)

    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 4, 5)
    println(set1.intersect(set2))
    println(set1.union(set2))

    val peopleAges = mutableMapOf(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51

    peopleAges.forEach { print("${it.key} is ${it.value}, ") }
    println()

    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))

    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)

    val words = listOf("about", "acute", "balloon", "best", "brief", "class")
    val filteredWords = words
        .filter { it.startsWith("b", true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords)

    val arguments: Map<String, String>? = mapOf("letter" to "A")
    var letterId = ""
    arguments?.let {
        letterId = it["letter"].toString()
    }
    println(letterId)

    val box = Box().apply {
        width = 10
        height = 20
    }
    println(box.area())

    val triple: (Int) -> Int = { a -> a * 3 }
    println(triple(5))

    println(Detail.LETTER)

    val lazyValue by lazy { "Lazy initialized" }
    println(lazyValue)

    val game = Game()
    game.initWord("Kotlin")
    println(game.currentScrambledWord)

    var quantity: Int? = null
    println(quantity ?: 0)
    quantity = 4
    println(quantity ?: 0)
}

class Box {
    var width = 0
    var height = 0
    fun area() = width * height
}

class Detail {
    companion object {
        const val LETTER = "letter"
    }
}

class Game {
    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord

    lateinit var currentWord: String

    fun initWord(word: String) {
        currentWord = word
        _currentScrambledWord = word.reversed()
    }
}
