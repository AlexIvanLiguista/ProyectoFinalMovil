package com.ups.androidmaster.sintaxis

fun main(){

}
fun result(value:Any){
    when(value){
        is Int -> value+value
        is String-> println("Es string")
        is Boolean->if (value) println("Es Alex")
    }
}

fun getSemestre(month: Int){
    when(month){
        in 1..6 -> println("Primer semestre")
        in 7..12-> println("Segundo semestre")
        !in 12..20-> println("Semestre no valido")
    }
}

fun getSemestre2(month: Int) = when(month){
        in 1..6 -> "Primer semestre"
        in 7..12-> "Segundo semestre"
        !in 12..20-> "Semestre no valido"
        else -> "dawda"
    }

fun getTrimentre(month:Int){
    when(month){
        1,2,3 -> println("Primero")
        4,5,6 -> println("Segundo")
        7,8,9 -> println("Tercero")
        10,11,12 -> println("Cuarto")
        else-> println("trimestre no valido")
    }
}
fun getMonth(month: Int){
    when(month){
        1-> println("Enero")
        2-> println("Enero")
        3-> println("Enero")
        4-> println("Enero")
        5-> println("Enero")
        6-> println("Enero")
        7-> println("Enero")
        8-> {println("Enero")
            println("Otro")
        }
        9-> println("Enero")
        10-> println("Enero")
        11-> println("Enero")
        12-> println("Enero")
        else -> println("No es un es")
    }

}