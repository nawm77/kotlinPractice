package rus.nawm.lab2

import java.util.*

fun main() {
    val num1 = 2
    val num2 = 6
    println("У вас есть числа: $num1 и $num2")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")
    val sc = Scanner(System.`in`)
    val action = sc.nextLine()
    when (action) {
        "1" -> println("Результат: ${num1 + num2}")
        "2" -> println("Результат: ${num1 - num2}")
        else -> println("Результат: 0")
    }
}