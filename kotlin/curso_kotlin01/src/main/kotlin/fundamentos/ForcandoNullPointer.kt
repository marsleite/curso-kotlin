package fundamentos

fun main() {
    var a: Int? = null
    print(a?.inc())

    println("Momento do erro")
    println(a!!.inc())
}