package com.matthew

fun main() {
//    println("Hello, Kotlin!!")
//    Human().hello()
    val h = Human()
    h.hello()
    val name : String
    name = "Matthew"
    var x = 1.6f
    var age = 19
    age = 20
}

class Human {
    fun hello() {
        println("Hello, Kotlin!")
    }
}