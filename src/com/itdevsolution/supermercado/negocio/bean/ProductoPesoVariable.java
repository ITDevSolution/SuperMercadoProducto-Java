package com.itdevsolution.supermercado.negocio.bean;

import com.itdevsolution.supermercado.util.Producto;

public class ProductoPesoVariable extends Producto {
	
	private double cantidad;
	private double precioPorUnidadMedida;
	private String unidadMedida;
	
	public ProductoPesoVariable(String id, String descripcion, double tarifa, double cantidad,
			double precioPorUnidadMedida, String unidadMedida) {
		
		super(id, descripcion, tarifa);
		this.cantidad = cantidad;
		this.precioPorUnidadMedida = precioPorUnidadMedida;
		this.unidadMedida = unidadMedida;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioPorUnidadMedida() {
		return precioPorUnidadMedida;
	}

	public void setPrecioPorUnidadMedida(double precioPorUnidadMedida) {
		this.precioPorUnidadMedida = precioPorUnidadMedida;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	@Override
	public double obtenerValorIva() {
		// TODO Auto-generated method stub
		return precioPorUnidadMedida * cantidad * getTarifa();
	}

	@Override
	public double obtenerValorVenta() {
		// TODO Auto-generated method stub
		return precioPorUnidadMedida * cantidad + obtenerValorIva();
	}

	@Override
	public String toString() {
		return String.format( "%s\n\t"
				+ "Cantidad...................: %,.2f "+unidadMedida+"\n\t"
				+ "Precio Por Unidad de Medida: $%,.2f\n\t"
				+ "Unidad de Medida...........: %s\n\t"
				+ "Valor IVA..................: $%,.2f\n\t"
				+ "Precio de Venta............: $%,.2f\n"
				+ "++++++++++++++++++++++++++++++++++++++++++++++\n",
				super.toString(), cantidad, precioPorUnidadMedida, unidadMedida, obtenerValorIva(), obtenerValorVenta());
	}
	
	
}
