package rus.nawm.lab3

import java.util.Scanner

fun main() {
    val n = 5
    val scanner: Scanner = Scanner(System.`in`)
    while (scanner.nextInt() != n) {
        println("Try one more time")
    }
    println("Correct")
}