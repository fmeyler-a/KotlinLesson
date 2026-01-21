fun main(){

}

fun nullCheck(a: String?, b: String?): String? {
    return if (a != null && b != null) {
        a + b
    } else {
        null
    }
}