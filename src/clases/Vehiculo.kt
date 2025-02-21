package com.dam1.eju5.src.clases

abstract class Vehiculo(val marca: String, val modelo: String, val anio: Int){

    init {
        require(marca.isNotEmpty() && modelo.isNotEmpty() && anio >= 0) {" Ese vehiculo no esta disponible..."}
    }

    fun acelerar(): String{
        return "$marca $modelo esta acelerando."
    }
    fun frenar(): String{
        return "$marca $modelo esta frenando."
    }
    open fun mostrarInformacion(): String{
        return "Marca: $marca Modelo: $modelo, Año: $anio."
    }
}