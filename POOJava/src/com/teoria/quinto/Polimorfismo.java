package com.teoria.quinto;

public class Polimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//grupo de textos
		String[] textos= {"texto1","texto2","texto3"};
		textos[0].length();
		textos[1].length();
		
		Gato[] gatos= {new Gato(),new Gato(),new Gato()};
		gatos[0].comer();
		
		//polimorfismo basado en herencia
		//Animal padre - Gato, Perro hijas
		Animal[] animales= {new Gato(),new Gato(),new Gato(),new Perro()};
		animales[0].comer();//método comer será de Gato o de Perro, lo que toque
		animales[3].comer();
	}

}
