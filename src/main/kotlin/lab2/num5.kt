package rus.nawm.lab2

fun main() {
    val num1 = 10
    val num2 = 20
    val num3 = 30
    val average = findAverage(num1, num2, num3)
    when {
        num1 == num2 && num2 == num3 -> println("Ошибка")
        else -> println("Среднее: $average")
    }
}

fun findAverage(a: Int, b: Int, c: Int): Int {
    return listOf(a, b, c).sorted()[1]
}
