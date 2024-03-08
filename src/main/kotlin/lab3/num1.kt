package rus.nawm.lab3
fun main() {
    printer(6)
}


fun printer(n:Int) = (1..n).forEach { println("$it".repeat(it)) }