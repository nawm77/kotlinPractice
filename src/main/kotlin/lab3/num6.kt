package rus.nawm.lab3

fun main() {
    var sum = 0
    var currentNumber = 5
    while (currentNumber <= 57) {
        if (currentNumber !in setOf(34, 46, 52)) {
            sum += currentNumber
        }
        currentNumber++
    }
    println(sum)
}
