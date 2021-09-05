// 1) ?. [safe call] - типа if (a != null) return a.length() else return null
// избегаем исключения, но возвращая null дальше по стеку вызовов.

// 2) ?: [elvis] - возвр значение слева если оно не null, иначе значение справа.
// val c: String = b ?: ""

// 3) !! [non-null] - преобразование типа к notnull
//val b: String? = readLine()
//val c: String = b!!

// 4) Type? [nullable / notnull types]
// str: String? - значит, что в str можно заассайнить null

fun main() {
    val s: String? = null;
    var h = s ?: "sss";
    print(h)
}

fun method(): Int {
    return 4
}