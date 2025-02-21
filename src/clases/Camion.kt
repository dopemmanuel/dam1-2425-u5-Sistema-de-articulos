package com.dam1.eju5.src.clases

class Camion(marca: String, modelo: String, anio: Int, val capacidadCarga: Int) :
    Vehiculo(marca, modelo, anio) {

    override fun mostrarInformacion(): String {
        return super.mostrarInformacion() + ", Capacidad de Carga: $capacidadCarga kg"
    }
}