fun main() {
    print("Введите число x: ")
    val x = readln().toDouble()
    print("Введите число y: ")
    val y = readln().toDouble()

    print("Введите радиус: ")
    val radius = readln().toDouble()
    val belongsToCircle = when {
        x * x + y * y <= radius * radius -> "Точка ($x, $y) принадлежит заштрихованной части плоскости."
        else -> "Точка ($x, $y) не принадлежит заштрихованной части плоскости."
    }

    println(belongsToCircle)


}