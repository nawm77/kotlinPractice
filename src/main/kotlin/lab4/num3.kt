package rus.nawm.lab4

import java.util.*

fun main() {
    val size = 40
    val numbers = IntArray(size)
    val random = Random()
    for (i in numbers.indices) {
        numbers[i] = random.nextInt()
    }
    println("Случайно заполненный массив:")
    println(numbers.joinToString(", "))
    if (numbers.isNotEmpty()) {
        val min = numbers.minOrNull()
        val max = numbers.maxOrNull()
        println("Минимальный элемент: $min")
        println("Максимальный элемент: $max")
    } else {
        println("Массив пустой")
    }
}
