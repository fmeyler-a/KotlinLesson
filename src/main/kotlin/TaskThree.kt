import kotlin.text.iterator

fun String.vowels(): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y',
        'A', 'E', 'I', 'O', 'U', 'Y',
        'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
        'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я')

    var count = 0

    for (char in this) {
        if (char in vowels) {
            count++
        }
    }

    return count
}

fun main(){
    val text = "Учу КОТЛИН каждый день!"
    println(text.vowels())

}