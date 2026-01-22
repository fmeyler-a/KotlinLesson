fun main(){
    val isStringNull = mergeStrings("", "")
    println(isStringNull)
}

fun mergeStrings(a: String?, b: String?): String? {
    if (a.isNullOrEmpty() && b.isNullOrEmpty()) return null
    if (a.isNullOrEmpty()) return b
    if (b.isNullOrEmpty()) return a
    return a + b
}
