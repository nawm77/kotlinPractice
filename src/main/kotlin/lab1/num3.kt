package rus.nawm.lab1

fun main() {
    spliterator(555)
}

fun spliterator(number: Int) {
    println(number.toString().toCharArray().joinToString(", "))
}