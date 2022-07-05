package com.grupog8.controlasistencia.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {

	@Id
	public int id;
	
	@Column
	public String nombres;
	
	@Column
	public String apellidos;
	
	@Column
	public int edad;
	
	@Column 
	public String cargo;
	
	@Column
	public int numeroCelular;
	
	@Column(name = "FechaIngreso")
    public Timestamp fechaIngreso;
	
	@Column(name = "FechaSalida")
    public Timestamp fechaSalida;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public Timestamp getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Timestamp fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Timestamp getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Timestamp fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Empleado() {
		super();
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", cargo=" + cargo + ", numeroCelular=" + numeroCelular + ", fechaIngreso="
				+ fechaIngreso + ", fechaSalida=" + fechaSalida + "]";
	}
	
}
