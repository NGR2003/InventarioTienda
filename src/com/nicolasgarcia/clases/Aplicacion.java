package com.nicolasgarcia.clases;

public class Aplicacion {
    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica();

        // Crear objetos de diferentes tipos de productos electrónicos
        ProductoElectrodomestico televisor = new Televisor("Televisor Smart", 500.00, 10, "50 pulgadas", "4K");
        ProductoElectrodomestico computadora = new ComputadoraPortatil("Computadora Portátil", 800.00, 5, "Dell", 16, 12345);
        ProductoElectrodomestico electrodomestico = new ProductoElectrodomestico("Lavadora", 300.00, 20);

        // Agregar productos al inventario de la tienda
        tienda.agregarProducto(televisor);
        tienda.agregarProducto(computadora);
        tienda.agregarProducto(electrodomestico);

        // Mostrar productos disponibles en el inventario
        System.out.println("Productos disponibles en el inventario:");
        tienda.mostrarProductos();

        // Realizar algunas ventas
        tienda.realizarVenta("Televisor Smart", 2);
        tienda.realizarVenta("Computadora Portátil", 1);
        tienda.realizarVenta("Lavadora", 5);

        // Mostrar productos disponibles después de las ventas
        System.out.println("\nProductos disponibles después de las ventas:");
        tienda.mostrarProductos();
    }
}