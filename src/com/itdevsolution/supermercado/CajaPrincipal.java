package com.itdevsolution.supermercado;

import com.itdevsolution.supermercado.negocio.bean.ProductoCompuesto;
import com.itdevsolution.supermercado.negocio.bean.ProductoPesoVariable;
import com.itdevsolution.supermercado.negocio.bean.ProductoPrecioFijo;
import com.itdevsolution.supermercado.util.Producto;

public class CajaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductoPrecioFijo ppf1 = new ProductoPrecioFijo("00001", "Aceite Primor", 0.17, 3);
		ProductoPrecioFijo ppf2 = new ProductoPrecioFijo("00002", "Coca Cola", 0.17, 1.5);
		
		ProductoPesoVariable ppv1 = new ProductoPesoVariable("00010", "Azucar", 0.17, 0.350, 2, "Gramos");
		ProductoPesoVariable ppv2 = new ProductoPesoVariable("00011", "Arros", 0.17, 3, 3.5, "Kg");
		
		Producto productos[] = {ppf1, ppf2, ppv1, ppv2};
		
		ProductoCompuesto pc1 = new ProductoCompuesto("1", "Ancheta Don Ebrio", 0.16, productos);
		
		for(Producto productoFijoActual: productos) {
			System.out.println(productoFijoActual);
		}
		
		System.out.println(pc1);
	}

}
