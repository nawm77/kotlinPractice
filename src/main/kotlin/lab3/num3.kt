package rus.nawm.lab3

fun main() {
    println(del(45))
}

fun del(n: Int): String = (1..n).filter { n % it == 0 }.joinToString { it.toString() }
