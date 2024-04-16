package com.ups.androidmaster.exercises

fun main(){
    mutableList()

}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes","Miercoles","Jueves","Viernes","Sábado","Domingo")
    weekDays.add(0,"AlexIvan")
    println(weekDays)
}

fun unmutableList(){
    val readOnly: List<String> = listOf("Lunes", "Martes","Miercoles","Jueves","Viernes","Sábado","Domingo" )
//    println(readOnly)
//    println(readOnly.size)
//    println(readOnly.last())
//    println(readOnly.first())
    val example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach { weekDay -> println(weekDay) }
}