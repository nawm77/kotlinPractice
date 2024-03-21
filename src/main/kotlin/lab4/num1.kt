package lab4

fun main() {
    println(rangeBetween(3, 5).joinToString(", "))
}

fun rangeBetween(n: Int, m: Int): IntArray = (minOf(n, m) until maxOf(n, m) + 1).toList().toIntArray()

