package fundamentos.controles

fun main() {
    val num1: Int = 2
    val num2: Int = 5

    val maior = if (num1 > num2) {
        num1
    } else {
        num2
    }

    println("O maior valor é $maior")
}