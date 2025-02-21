package com.dam1.eju5.src


import com.dam1.eju5.src.clases.Auto
import com.dam1.eju5.src.clases.Camion
import com.dam1.eju5.src.clases.Moto
/**
Ejercicio 6: Sistema de Gestión de Vehículos
Crea una jerarquía de clases para modelar un sistema de vehículos:

Clase Vehiculo con atributos como marca, modelo y año.

Subclases Auto, Moto y Camion, con atributos adicionales como capacidadPasajeros, cilindrada, capacidadCarga, respectivamente.
Añade métodos como acelerar(), frenar() y mostrarInformacion().

Objetivos:
Practicar la especialización de clases.
Aplicar herencia y sobreescritura de métodos.
Familiarizarse con objetos de diferentes categorías.
 */

fun main() {
    val auto = Auto("Toyota", "Corolla", 2022, 5)
    val moto = Moto("Yamaha", "MT-07", 2021, 689)
    val camion = Camion("Volvo", "FH16", 2020, 25000)

    val vehiculos = listOf(auto, moto, camion)
    println("------".repeat(12))

    for (vehiculo in vehiculos) {
        println(vehiculo.mostrarInformacion())
        vehiculo.acelerar()
        vehiculo.frenar()
        println("------".repeat(12))
    }
}