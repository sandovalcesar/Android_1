package com.cesarsandoval.android_1

//VARIABLES
val age1: Int = 42
var age2 = 30

fun main() {
    showMyName("cesar")
    showMyAge(42)
    add(5, 7)
    val mySubtrack = subtrack(10, 5)
    println(mySubtrack)

}

fun showMyName(name:String) {
    println("Me llamo $name")
}

fun showMyAge(currentAge: Int) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}
fun subtrack(firstNumber: Int, secondNumber: Int):Int {
    return (firstNumber - secondNumber)
}
fun variableNumerica() {
    //Int

    var age2 = 30

    //Long
    val example: Long = 33554411122122587

    //Float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 3216.123456

    println("sumar")
    println(age1 + age2)

    println("restar")
    println(age1 - age2)

    println("multiplicar")
    println(age1 * age2)

    println("dividir")
    println(age1 / age2)

    println("resto")
    println(age1 % age2)
}

fun variableBoolena() {
    //Boolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false

}

fun variableAlfanumerica() {
    //Char
    val charExaple1: Char = 'C'
    val charExaple2: Char = 'e'
    val charExaple3: Char = '@'
    val charExaple4: Char = '1'

    //String
    val stringExamplre: String = "Esto es una cadena de caracteres"


    /**
    print(stringExamplre)**/


    var stringConcatenada: String = "César"

    println("Hola me llamo $stringConcatenada y tengo $age1")
}