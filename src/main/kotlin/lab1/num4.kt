package rus.nawm.lab1

fun main() {
    dateProcess(2642)
}

fun dateProcess(days: Int) {
    println("Лет: ${days/365}, недель: ${(days%365)/7}, дней: ${days%365%7}")
}