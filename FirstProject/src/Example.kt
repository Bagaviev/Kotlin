// 1) ?. [safe call] - типа if (a != null) return a.length() else return null
// избегаем исключения, но возвращая null дальше по стеку вызовов.

// 2) ?: [elvis] - возвр значение слева если оно не null, иначе значение справа.
// val c: String = b ?: ""

// 3) !! [non-null] - преобразование типа к notnull
//val b: String? = readLine()
//val c: String = b!!

// 4) Type? [nullable / notnull types]
// str: String? - значит, что в str можно заассайнить null
/*
fun main() {
    val s: String? = null;
    var h = s ?: "sss";
    print(h)
}

fun method(): Int {
    return 4
}
*/

fun main() {
    test(MyDate(2014, 5, 8), MyDate(2014, 9, 23))
}

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) {
    operator fun compareTo(other: MyDate) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
