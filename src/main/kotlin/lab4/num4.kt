package rus.nawm.lab4

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Введите размер массива: ")
    val size = scanner.nextInt()
    val numbers = IntArray(size) { Random().nextInt(100) }
    println("Сгенерированный массив:")
    println(numbers.joinToString(", "))
    val secondMin = findSecondMin(numbers)
    println("Второй минимальный элемент: $secondMin")
}

fun findSecondMin(arr: IntArray): Int {
    var min = Int.MAX_VALUE
    var secondMin = Int.MAX_VALUE
    for (num in arr) {
        if (num < min) {
            secondMin = min
            min = num
        } else if (num < secondMin && num != min) {
            secondMin = num
        }
    }
    return secondMin
}
