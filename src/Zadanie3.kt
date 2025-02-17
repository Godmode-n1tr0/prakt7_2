import kotlin.math.sqrt
import kotlin.math.abs

fun main() {
    print("Введите число x: ")
    val x = readln().toDouble()
    print("Введите число y: ")
    val y = readln().toDouble()
    print("Введите число R: ")
    val R = readln().toDouble()

    val distanceToSemicircle = when {
        y >= 0 -> abs(y)
        else -> {
            val distanceToCenter = sqrt(x * x + y * y)
            abs(distanceToCenter - R)
        }
    }

    println("Расстояние от точки ($x, $y) до контура полукруга: $distanceToSemicircle")
}