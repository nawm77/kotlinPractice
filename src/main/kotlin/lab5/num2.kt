package rus.nawm.lab5

fun getYearsEnding(years: Int): String {
    return when {
        years % 10 == 1 && years % 100 != 11 -> "$years год"
        years % 10 in 2..4 && years % 100 !in 12..14 -> "$years года"
        else -> "$years лет"
    }
}

fun main() {
    println(getYearsEnding(1))
    println(getYearsEnding(2))
    println(getYearsEnding(3))
    println(getYearsEnding(5))
    println(getYearsEnding(11))
    println(getYearsEnding(12))
}
