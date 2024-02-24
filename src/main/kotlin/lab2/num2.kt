package rus.nawm.lab2

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите свой возраст")
    val age = sc.nextInt()
    when (age) {
        in 0..17 -> println("Вы еще слишком молоды")
        18 -> println("Ура, Вам 18 лет!")
        else -> println("Вам уже все можно!")
    }
}