fun main() {
    print("Введите число a: ")
    val a = readln().toDouble()
    print("Введите число b: ")
    val b = readln().toDouble()
    print("Введите число b: ")
    val c = readln().toDouble()
    val maxVal = maxOf(a, b, c)
    val minVal = minOf(a, b, c)

    val P = when {
        a == b && b == c -> {
            println("Все числа равны. P = $a")
            a
        }
        else -> (maxVal + minVal) / 2
    }
    println("P = $P")
}