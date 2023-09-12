package com.example.firstkotlinprogram

val x: Int = 15
val y: Int = 7
val z: Double = x / y.toDouble()

fun main() {
    println("Inserisci il tuo nome");
    var userName : String = readln();
    println("Inserisci il tuo cognome");
    var userLastname : String = readln();
    println("Inserisci la tua età");
    var age: Int = readln().toInt();
    println("Benvenuto $userName $userLastname . Hai $age anni")
}
