package rus.nawm.lab1

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите свое имя")
    val name = sc.nextLine()
    println("Введите свой возраст")
    val age = sc.nextInt()
    println("Привет, $name! Тебе уже $age")
}