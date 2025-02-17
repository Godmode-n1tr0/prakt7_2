fun main() {
    try{
        print("Введите число k: ")
        val N1 = readln().toInt()
        print("Введите число k: ")
        val N2 = readln().toInt()
        print("Введите число k: ")
        val N3 = readln().toInt()

        val minMissed = minOf(N1, N2, N3)

        when {
            minMissed < 10 -> println("Есть хорошая группа.")
            else -> println("Нет хорошей группы.")
        }
    }
    catch (e:Exception) {
        println("Невернны ввод.")
    }
}