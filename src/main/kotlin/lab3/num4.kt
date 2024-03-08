package rus.nawm.lab3

fun main() {
    counter(32)
}

fun counter(n: Int) {
    var even = 0
    var odd = 0
    n.toString().forEach {
        val digit = it.toString().toInt()
        if (digit % 2 == 0) {
            even += digit
        } else {
            odd += digit
        }
    }
    println("Сумма четных цифр: $even")
    println("Сумма нечетных цифр: $odd")
}
