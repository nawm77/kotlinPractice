package rus.nawm.lab5

fun calculateFinalPrice(initialPrice: Double, discountPercentage: Double): Double {
    val discountedPrice = initialPrice * (1 - discountPercentage / 100)
    return String.format("%.2f", discountedPrice).replace(",", ".").toDouble()
}

fun main() {
    val initialPrice = 100.0
    val discountPercentage = 20.0
    val finalPrice = calculateFinalPrice(initialPrice, discountPercentage)
    println("Исходная цена: $initialPrice")
    println("Процент скидки: $discountPercentage%")
    println("Конечная цена: $finalPrice")
}

