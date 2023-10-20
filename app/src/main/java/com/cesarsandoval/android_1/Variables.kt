package com.cesarsandoval.android_1

//VARIABLES
val age1: Int = 42
var age2 = 30
fun main() {
variableNumerica()

}

fun variableNumerica(){
    //Int

    var age2 = 30

    //Long
    val example:Long = 33554411122122587

    //Float
    val floatExample:Float = 30.5f

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

fun variableBoolena (){
    //Boolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false

}

fun variableAlfanumerica(){
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