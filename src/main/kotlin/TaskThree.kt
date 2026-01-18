import kotlin.text.iterator

// Функция печатает только гласные из строки
fun vowels(s: String): String {

    val onlyVawels = "аоуэыяёеюиАОУЭЫЯЕЁЮИ"
    for (i in s) {
        if (i in onlyVawels) {
            print(i)
        }
    }
    return onlyVawels
}

fun main() {
    val text = "Учу КОТЛИН каждый день!"
    vowels(text)
}
