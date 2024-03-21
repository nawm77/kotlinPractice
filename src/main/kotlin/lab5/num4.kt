package rus.nawm.lab5

fun main() {
    println(counter(" Это строка с знаками! припенания, такие как точка. запятая, и тире-"))
}

fun counter(str: String): Int {
    return str.trim().replace("\\s{2,}", " ").replace(Regex("[\\\\p{Punct}]"), " ").split(" ").size
}