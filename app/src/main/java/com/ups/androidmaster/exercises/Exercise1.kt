package com.ups.androidmaster.exercises

fun main(){
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = false
    println("El precio de la pelicula para una persona de edad $child años es \$${ticketPrice2(child,isMonday)}.")
    println("El precio de la pelicula para una persona de edad $adult años es \$${ticketPrice2(adult,isMonday)}.")
    println("El precio de la pelicula para una persona de edad $senior años es \$${ticketPrice2(senior,isMonday)}.")

}

fun ticketPrice(age: Int, isMonday:Boolean):Int{
    if (age == 5){
        return 15
    }else if (age == 28){
        return 25
    }else if (age == 87){
        return 20
    }else
        return 0
}
fun ticketPrice2(age: Int, isMonday:Boolean):Int{
   return  when(age){
        in 1..12->  15
        in 13..60->if (isMonday)  25 else  30
        in 61..100->  20
        else ->   -1
    }
}