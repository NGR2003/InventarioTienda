package com.nicolasgarcia.clases;

import java.util.ArrayList;
import java.util.List;

public class TiendaElectronica {
    private List<ProductoElectrodomestico> listaDeProductos;

    // Constructor
    public TiendaElectronica() {
        listaDeProductos = new ArrayList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
    }

    // Método para mostrar todos los productos disponibles en el inventario
    public void mostrarProductos() {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            producto.mostrarInformacion();
            System.out.println("--------------------------");
        }
    }

    // Método para buscar un producto por su nombre
    public ProductoElectrodomestico buscarProducto(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    // Método para realizar una venta
    public void realizarVenta(String nombre, int cantidad) {
        ProductoElectrodomestico producto = buscarProducto(nombre);
        if (producto != null && producto.getCantidadDisponible() >= cantidad) {
            producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
            System.out.println("Venta realizada con éxito.");
        } else {
            System.out.println("Producto agotado o no disponible.");
        }
    }
}
