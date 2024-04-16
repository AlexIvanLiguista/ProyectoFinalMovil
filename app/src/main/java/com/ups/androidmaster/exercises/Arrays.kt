package com.ups.androidmaster.exercises

fun main(){
    var weekDays = arrayOf("Lunes", "Martes","Miercoles","Jueves","Viernes","Sábado","Domingo")
    println(weekDays[0])

    for (position in weekDays.indices){
        //println(weekDays[position])
    }

    for ((position,value) in weekDays.withIndex()){
        println("La posicion $position contiene $value")
    }
    for (cualquiera in weekDays){
        println("Ahora es $cualquiera")
    }
}

//Bucles para arrays

