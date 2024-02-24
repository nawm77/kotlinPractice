package rus.nawm.lab2

fun main() {
    val export = 1500 // Объем экспорта
    val import = 2000 // Объем импорта

    val balance = export - import // Сальдо торгового баланса

    if (balance > 0) {
        val profit = balance
        println("Прибыль: $profit")
    } else if (balance < 0) {
        val loss = -balance
        println("Убыток: $loss")
    } else {
        println("Нет прибыли и убытков")
    }
}
