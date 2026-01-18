fun Vowels(s: String): String {

    val vowel = "аеёиоуАЕЁИОУ"
    return s.filter { it in vowel }
}

fun main(){
    val text = "Учу КОТЛИН каждый день!"
    println(Vowels(text))
}