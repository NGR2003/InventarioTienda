package com.nicolasgarcia.clases;

public class Televisor extends ProductoElectrodomestico {
	private String resolucion;
    private String tipoPantalla;
    
    public Televisor(String nombre, double precio, int cantidadDisponible, String resolucion, String tipoPantalla) {
    	super(nombre, precio, cantidadDisponible);
    	this.resolucion = resolucion;
    	this.tipoPantalla = tipoPantalla;
    }
    
    @Override
    public void mostrarInformacion() {
    	super.mostrarInformacion();
    	System.out.println("La resolucion de la pantalla es: " + resolucion);
    	System.out.println("El tipo de pantalla es: " + tipoPantalla);
    }

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}
}
