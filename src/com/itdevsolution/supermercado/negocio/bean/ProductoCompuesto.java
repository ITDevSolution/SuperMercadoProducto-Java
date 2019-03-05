package com.itdevsolution.supermercado.negocio.bean;

import com.itdevsolution.supermercado.util.Producto;

public class ProductoCompuesto extends Producto {

	private Producto productos[];

	public ProductoCompuesto(String id, String descripcion, double tarifa, Producto[] productos) {
		super(id, descripcion, tarifa);
		this.productos = productos;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	@Override
	public double obtenerValorIva() {
		// TODO Auto-generated method stub
		double valor = 0;
		for (Producto producto : productos) {
			valor += producto.obtenerValorIva();
		}
		return valor;
	}

	@Override
	public double obtenerValorVenta() {
		// TODO Auto-generated method stub
		double valor = 0;
		for (Producto producto : productos) {
			valor += producto.obtenerValorVenta();
		}
		return valor;
	}

	@Override
	public String toString() {
		String aux = "";
		for (Producto producto : productos) {
			aux += producto.getDescripcion() + ", ";
		}
		return String.format("%s\n\t" + "Componentes.......: %s\n\t"
				+ "Valor IVA.........: $%,.2f\n\t" 
				+ "Valor de Venta....: $%,.2f", super.toString(), aux,
				obtenerValorIva(), obtenerValorVenta());
	}

}
