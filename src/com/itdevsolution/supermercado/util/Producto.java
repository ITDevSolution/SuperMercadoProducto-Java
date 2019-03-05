package com.itdevsolution.supermercado.util;

public abstract class Producto {
	
	private String id;
	private String descripcion;
	private double tarifa;
	
	public Producto(String id, String descripcion, double tarifa) {
		this.id = id;
		this.descripcion = descripcion;
		this.tarifa = tarifa;
	}
	
	public abstract double obtenerValorIva();
	public abstract double obtenerValorVenta();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return String.format("+++++++++++++++++++++++++++++++++++++++++++++\n"
							+ "+++++++++ SUPER MERCADO SANTA ANITA ++++++++\n"
							+ "++++++++++++++++++++++++++++++++++++++++++++\n\t"
							+ "ID Producto.........: %s\n\t"
							+ "Descripcion Producto: %s\n\t"
							+ "Tarifa IVA..........: $%,.2f", id,descripcion,tarifa);
	}
	

}
