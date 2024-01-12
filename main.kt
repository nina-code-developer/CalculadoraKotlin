package calculadora

import kotlin.system.exitProcess

fun main() {
    selecciona()
}


fun selecciona() {
    while (true) {
        println("\n")
        println("1) Sumar")
        println("2) Restar")
        println("3) Multiplicar")
        println("4) Salir")
        println("Escoge un opcion: ")
        val opc = readLine()
        when (opc) {
            "1" -> {
                println("Vamos a Sumar!!")
                println("Ingresa el primer valor: ")
                val num1 = readLine()?.toIntOrNull()
                println("Ingresa el segundo valor: ")
                val num2 = readLine()?.toIntOrNull()


                if (num1 != null && num2 != null) {
                    println("El resultado de ambos numero es: ${num1 + num2}")
                } else {
                    println("Ingresa bien los valores numericos")
                }

            }

            "2" -> {
                println("Vamos a Restar!!")
                println("Ingresa un numero: ")
                val num1 = readLine()?.toIntOrNull()
                println("Ingresa otro numero: ")
                val num2 = readLine()?.toIntOrNull()

                if (num1 != null && num2 != null) {
                    println("El resultado es: ${num1 - num2}")
                } else {
                    println("Ingresa bien los valores numericos")
                }
            }

            "3" -> {
                println("Vamos a Multiplicar!!")
                println("Ingresa un numero: ")
                val num1 = readLine()?.toIntOrNull()
                println("Ingresa otro numero: ")
                val num2 = readLine()?.toIntOrNull()

                if (num1 != null && num2 != null) {
                    println("El resultado es: ${num1 * num2}")
                } else {
                    println("Ingresa bien los valores numericos")
                }

            }

            "4" -> {
                println("¿Ya te vas :(?")
                val rpt1 = readLine()
                val rpt2 = readLine()

                if (rpt1 == "si") {
                    println("No te vayas chavo :c")
                    println("Saliento del programa...")
                    exitProcess(0)
                } else if (rpt2 == "no") {
                    println("Atrapado en la matrix >:D")
                } else {
                    println("Escribe bonito ya :v")
                }
            }

        }

    }
}