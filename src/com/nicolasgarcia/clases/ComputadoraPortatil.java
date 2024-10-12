package com.nicolasgarcia.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
	private String marca;
	private double memoriaRAM;
	private int numeroSerie;
	
	public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, double memoriaRAM, int numeroSerie) {
		super(nombre, precio, cantidadDisponible);
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.numeroSerie = numeroSerie;
	}
	
	@Override
    public void mostrarInformacion() {
    	super.mostrarInformacion();
    	System.out.println("La marca es: " + marca);
    	System.out.println("Su memoria RAM es de: " + memoriaRAM + "GB");
    	System.out.println("El numero de serie es: " + numeroSerie); 
	}
}
