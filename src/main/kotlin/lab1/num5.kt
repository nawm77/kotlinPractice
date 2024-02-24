package rus.nawm.lab1

fun main() {
    println(defineNumber(23))
}

fun defineNumber(n: Int): String {
    return "${n}${n*2}"
}