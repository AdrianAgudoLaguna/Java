package com.teoria.tercero;

public class TiendaCamisas implements ITienda {//hay implementación múltiple

	@Override
	public void registrar() {
		System.out.println("En la tienda de camisas te registras con Google");

	}

	@Override
	public void comprar() {
		// TODO Auto-generated method stub
		System.out.println("En la tienda de camisas puedes comprar hasta 5 artículos");
	}

	@Override
	public void addCarrito(String articulo) {
		// TODO Auto-generated method stub
		System.out.println("En la tienda de camisas añades una camisa");
	}

	@Override
	public void pagar() {
		// TODO Auto-generated method stub
		System.out.println("En la tienda de camisas aceptamos pago por tarjeta sólo");
	}

}
