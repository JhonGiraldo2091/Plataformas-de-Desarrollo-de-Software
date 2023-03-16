package com.unir.api_sql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos",catalog = "tienda", schema = "")
public class Producto {
	@Id
	@Column
	private Integer idproducto;
	@Column
	private String codigo;
	@Column
	private String nombre;
	@Column
	private float precio;
	@Column
	private int cantidad;
	public Integer getIdproductos() {
		return idproducto;
	}
	public void setIdproductos(Integer idproductos) {
		this.idproducto = idproductos;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	


}