fun main(){
    val null1 = mergeStrings("Hello ", "World!")
    println(null1)
}

fun mergeStrings(a: String?, b: String?): String? =
    if (a != null && b != null) {
        a + b
    } else {
        a ?: b
    }
