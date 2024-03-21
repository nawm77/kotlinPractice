package rus.nawm.lab5

fun roundFourDigitNumbers(number: Int): String {
    return if (number in 1000..9999) {
        val roundedNumber = number / 1000
        "${roundedNumber}K"
    } else {
        number.toString()
    }
}

fun main() {
    println(roundFourDigitNumbers(999))
    println(roundFourDigitNumbers(1000))
    println(roundFourDigitNumbers(4567))
    println(roundFourDigitNumbers(10000))
}
