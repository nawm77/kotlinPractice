package rus.nawm.lab4

import java.util.*

fun main() {
    println(IntArray(Scanner(System.`in`).nextInt()) { Random().nextInt(100) }.sorted())
}