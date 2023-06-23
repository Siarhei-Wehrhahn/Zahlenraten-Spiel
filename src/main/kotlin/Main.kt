import kotlin.math.pow

fun main() {
    println("What's your Name?")
    var name = readln()
    println("Hello $name! What ist your weight in KG?")
    var kg = readln().toDouble()
    println("How tall are you in meter?")
    var high = readln().toDouble()
    var bmi = kg / (high.pow(2))
    println("Your calculated BMI is $bmi")
}
