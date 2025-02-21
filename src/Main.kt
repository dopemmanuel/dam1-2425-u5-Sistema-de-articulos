package com.dam1.eju5.src


import com.dam1.eju5.src.clases.Inventario
import com.dam1.eju5.src.clases.Producto

/**
Ejercicio 6: Sistema de Inventario de Tienda
Crea una clase Producto con propiedades como nombre, precio, stock y un método aplicarDescuento(Double).

Luego, diseña una clase Inventario que maneje una lista de productos con métodos para:

Agregar productos.
Buscar productos por nombre.
Mostrar productos con stock bajo.
Calcular el valor total del inventario.
Objetivos:
Practicar la manipulación de listas de objetos.
Implementar búsqueda y filtrado en colecciones.
Manejar correctamente los descuentos y el cálculo de stock.
 */


fun main() {


    val producto1 = Producto("Camiseta", 200.0, 20)
    val producto2 = Producto("Pantalón", 350.0, 5)
    val producto3 = Producto("Zapatos", 150.0, 30)

    Inventario().agregarProducto(producto1)
    Inventario().agregarProducto(producto2)
    Inventario().agregarProducto(producto3)

    val precioConDescuento = producto1.aplicarDescuento(15.0)
    println("Precio de la ${producto1.nombre} con descuento: $precioConDescuento")


    val productoBuscado = Inventario().buscarProductoPorNombre("Pantalón")
    productoBuscado?.let {
        println("Producto encontrado: ${it.nombre}, Precio: ${it.precio}, Stock: ${it.stock}")
    }

    val productosConStockBajo = Inventario().mostrarProductosConStockBajo()
    println("\nProductos con stock bajo:")
    for (producto in productosConStockBajo) {
        println("Producto: ${producto.nombre}, Stock: ${producto.stock}")
    }

    val valorTotal = Inventario().calcularValorTotalInventario()
    println("\nValor total del inventario: $valorTotal")

    println("\nInventario completo:")
    Inventario().mostrarInventario()

}