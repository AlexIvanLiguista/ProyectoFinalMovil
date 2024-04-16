package com.ups.androidmaster.sintaxis
//VARIABLES
val valUno: Int = 10
val valDos: Int = 20
fun main(){
    val name = "Alex"
    val ege:Int = 29
    var age2:Int = 29
    println(age2)
    age2 = 28

    val longExample:Long = 2520000
    val floatExample: Float = 10.2f
    val doubleExample:Double = 20.5545454
    val charExample1:Char = 'A'
    val stringExample:String = "Hola como estas"
    val booleanExample:Boolean = true
    var valImprimir: Int = variablesNumericas(10,50)
    println(valImprimir)
    println("La suma de los valores es: ${variablesNumericas(50,8)}")
    var guardaResta:Int = funcionResta(50,5)
    println(guardaResta)
}
fun variablesNumericas(paraUno:Int, paraDos:Int) = paraUno + paraDos
fun funcionResta(para1Uno:Int,para2Dos:Int):Int{
    return para1Uno - para2Dos
}