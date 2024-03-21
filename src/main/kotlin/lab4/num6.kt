package rus.nawm.lab4

import java.util.*

fun main() {
    val numbers = Scanner(System.`in`).nextLine().split(" ").map { it.toInt() }.toIntArray()
    val average = numbers.average()
    println("Элементы массива, больше среднего арифметического ($average):")
    numbers.filter { e -> e > average }.forEach { println(it) }
}
