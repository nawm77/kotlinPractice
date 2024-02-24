package rus.nawm.lab2

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val day = sc.nextInt()
    when (day) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Такого дня недели не существует")
    }
}