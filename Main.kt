import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {

    println("Выберите действие:")
    println("1.Деление")
    println("2.Умножение")

    val otv = readLine()!!.toInt()

    coroutineScope {
        launch {
            println("Введите сколько раз будет выполняться код")
            var n = readLine()!!.toInt()
            repeat(n) {
                delay(200)
                when (otv) {
                    1 -> {
                        println("Введите число 'a' которое нужно поделить")
                        var num1 = readLine()!!.toDouble()

                        println("Введите число 'b'")
                        var num2 = readLine()!!.toDouble()

                        var calkulytor_delenie = Calul()

                        var delenie = calkulytor_delenie.Calkulytor_delenie(num1, num2)
                        println("Ответ: $delenie")
                    }
                    2 -> {
                        println("Введите число 'a' которое нужно умножить")
                        var num1 = readLine()!!.toDouble()

                        println("Введите число 'b'")
                        var num2 = readLine()!!.toDouble()

                        var calkulytor_umnogenie = Calul()
                        var umnogenie = calkulytor_umnogenie.Calkulytor_umnogenie(num1, num2)
                        println("Ответ: $umnogenie")
                    }
                }
            }
        }
    }
}