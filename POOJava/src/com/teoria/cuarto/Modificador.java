package com.teoria.cuarto;

public class Modificador {

	
	//los modificadores de acceso son diferentes para las clases, métodos, propiedades.
	public void saludar1() {//se puede acceder desde cualquier sitio
		System.out.println("saludar público");
	}
	private void saludar2() {//solo desde su clase
		System.out.println("saludar privado");
	}
	protected void saludar3() {//accesible desde clases del mismo paquete y subclases
		System.out.println("saludar protected");
	}
	void saludar4() {//accesible desde clases del mismo paquete
		System.out.println("saludar default");
	}
	
	
}//cierra clase
