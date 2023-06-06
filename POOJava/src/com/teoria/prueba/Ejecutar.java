package com.teoria.prueba;

import com.teoria.cuarto.Modificador;
import com.teoria.primero.Coche;
import com.teoria.segundo.Hija;
import com.teoria.segundo.Padre;
import com.teoria.tercero.TiendaCamisas;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciar el objeto
		Coche coche1=new Coche(5, "seat", true);
		System.out.println(coche1);//muestra la posición en memoria
		Coche coche2=new Coche();
		System.out.println(coche2);//muestra la posición en memoria
		coche2.setPuertas(3);
		System.out.println("el coche tiene puertas :"+coche2.getPuertas());
		
		Hija hija1=new Hija();
		hija1.saludar();
		//instanciar la clase Padre: Si quieres que la padre No pueda instanciarse : abstracta
		//Padre padre1=new Padre();
		//padre1.saludar();
		
		TiendaCamisas tienda1=new TiendaCamisas();
		tienda1.pagar();
		
		Modificador modificador=new Modificador();
		modificador.saludar1(); //método public
		
	}//cierra main

}//cierra class Ejecutar
