package com.itdevsolution.supermercado.negocio.bean;

import com.itdevsolution.supermercado.util.Producto;

public class ProductoPrecioFijo extends Producto{
	
	private double precio;

	public ProductoPrecioFijo(String id, String descripcion, double tarifa, double precio) {
		super(id, descripcion, tarifa);
		this.precio = precio;
	}
	
	

	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	@Override
	public double obtenerValorIva() {
		// TODO Auto-generated method stub
		return precio * getTarifa();
	}

	@Override
	public double obtenerValorVenta() {
		// TODO Auto-generated method stub
		return precio + obtenerValorIva();
	}

	
	@Override
	public String toString() {
		return String.format( "%s\n\t"
							+ "Precio de Compra....: $%,.2f\n\t"
							+ "Valor IVA...........: $%,.2f\n\t"
							+ "Precio de Venta.....: $%,.2f\n"
							+ "++++++++++++++++++++++++++++++++++++++++++++++\n",
							super.toString(), precio, obtenerValorIva(), obtenerValorVenta());
	}
	
	
}
