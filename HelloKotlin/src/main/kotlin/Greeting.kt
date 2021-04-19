import java.lang.Integer.*

fun main(args: Array<String>) {
    println("${ if (args[0].toInt() > 12) "Good Night" else "Good Morning"}, Kotlin")
}