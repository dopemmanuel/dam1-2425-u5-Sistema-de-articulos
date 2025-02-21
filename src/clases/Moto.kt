package com.dam1.eju5.src.clases

class Moto(marca: String, modelo: String, anio: Int, val cilindrada: Int) :
    Vehiculo(marca, modelo, anio) {

    override fun mostrarInformacion(): String {
        return super.mostrarInformacion() + ", Cilindrada: $cilindrada cc"
    }
}