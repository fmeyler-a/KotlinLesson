fun applyToNumbers(numbers: List<Int>, transform: (Int) -> Int): List<Int> {
    return numbers.map { transform(it) }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val doubled = applyToNumbers(numbers) { number ->
        number * 2
    } // 2, 4, 6, 8, 10

    println(doubled)
}
