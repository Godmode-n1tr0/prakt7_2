fun main() {
    try{
        print("Введите число a: ")
        val a = readln().toDouble()
        print("Введите число b: ")
        val b = readln().toDouble()
        print("Введите число b: ")
        val c = readln().toDouble()
        var max = 0.0
        var min = 0.0
        when {
            a > b && a > c -> max = a
            b > a && b > c -> max = b
            c > b && c > a -> max = c
        }
        when {
            a < b && a < c -> min = a
            b < a && b < c -> min = b
            c < b && c < a -> min = c
        }
        val P = when {
            a == b && b == c -> {
                println("Все числа равны. P = $a")
                a
            }
            else -> (max + min) / 2
        }
        println("P = $P")
    }
    catch (e:Exception){
        println("Невернны ввод.")
    }
}