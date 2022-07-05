package com.grupog8.controlasistencia.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import com.grupog8.controlasistencia.entity.Empleado;

public interface IEmpleadoService {

	public void guardarActualizarEmpleado(Empleado empleado);
	
	public List<Empleado> traerEmpleados();
	
	public Optional<Empleado> traerEmpleadoById(int id);
	
	public List<Empleado> traerEmpleadoByCargo(String cargo);
	
	public List<Empleado> traerEmpleadoByEdad(int edad);
	
	public List<Empleado> traerFechaIngreso(String fechaIngreso);
	
	public List<Empleado> traerFechaSalida(String fechaSalida);
	
	public void actualizarEmpleado(Empleado empleado, int id);
	
	public void actualizarFechaIngreso(Empleado empleado, int id, Timestamp fechaIngreso);
	
	public void actualizarFechaSalida(Empleado empleado, int id, Timestamp fechaSalida);
	
	public void deleteById(int id);
	
}
