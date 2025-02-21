package com.dam1.eju5.src.clases

class Producto(val nombre: String, val precio: Double, val stock: Int){
    fun aplicarDescuento(porcentajeDescuento: Double): Double {
        val descuento = precio * (porcentajeDescuento / 100)
        return porcentajeDescuento - descuento
    }
}