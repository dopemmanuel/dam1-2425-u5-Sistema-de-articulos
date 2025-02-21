package com.dam1.eju5.src.clases


class Inventario {
    val productos = mutableListOf<Producto>()

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }

    fun buscarProductoPorNombre(nombre: String): Producto? {
        return productos.find { it.nombre.equals(nombre, ignoreCase = true) }
    }

    fun mostrarProductosConStockBajo(): List<Producto> {
        return productos.filter { it.stock < 10 }
    }

    fun calcularValorTotalInventario(): Double {
        return productos.sumOf { it.precio * it.stock }
    }

    fun mostrarInventario() {
        for (producto in productos) {
            println("Producto: ${producto.nombre}, Precio: ${producto.precio}, Stock: ${producto.stock}")
        }
    }
}
