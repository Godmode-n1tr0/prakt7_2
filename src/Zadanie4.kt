import kotlin.math.sqrt

fun main() {
    print("Введите число k: ")
    val k = readln().toDouble()
    print("Введите число a: ")
    val a = readln().toDouble()
    print("Введите число b: ")
    val b = readln().toDouble()

    val discriminant = b * b + 4 * k * a

    when {
        discriminant < 0 -> println("Нет точек пересечения.")
        discriminant == 0.0 -> {
            val x = -b / (2 * k)
            val y = k * x + b
            println("Одна точка пересечения: ($x, $y)")
        }
        else -> {
            val x1 = (-b + sqrt(discriminant)) / (2 * k)
            val y1 = k * x1 + b
            val x2 = (-b - sqrt(discriminant)) / (2 * k)
            val y2 = k * x2 + b
            println("Две точки пересечения: ($x1, $y1) и ($x2, $y2)")
        }
    }
}