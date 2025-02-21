package com.dam1.eju5.src.clases

class Auto(marca: String, modelo: String, anio: Int, val capacidadPasajeros: Int) :
    Vehiculo(marca, modelo, anio) {

    override fun mostrarInformacion(): String {
        return super.mostrarInformacion() + ", Capacidad Pasajeros: $capacidadPasajeros"
    }
}