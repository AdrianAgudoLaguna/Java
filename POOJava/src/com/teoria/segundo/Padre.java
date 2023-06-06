package com.teoria.segundo;

abstract public class Padre {//no puede ser instanciada

	private int unidades;
	
	public Padre() {}

	public Padre(int unidades) {
		super();
		this.unidades = unidades;
	}
	
	public void saludar() {
		System.out.println("hola desde el padre");
	}
	
}
