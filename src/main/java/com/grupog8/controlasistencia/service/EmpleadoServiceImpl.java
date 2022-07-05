package com.grupog8.controlasistencia.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupog8.controlasistencia.entity.Empleado;
import com.grupog8.controlasistencia.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	public EmpleadoRepository repo;
	
	public void guardarActualizarEmpleado(Empleado empleado) {
		repo.save(empleado);
	}
	
	public List<Empleado> traerEmpleados() {
		List<Empleado> empleado = new ArrayList<Empleado>();
		repo.findAll().forEach(empleado1 -> empleado.add(empleado1));
		return empleado;
	}

	public Optional<Empleado> traerEmpleadoById(int id) {
		return repo.findById(id);
	}
	
	public List<Empleado> traerEmpleadoByCargo(String cargo) {
		return repo.findByCargo(cargo);
	}
	
	public List<Empleado> traerEmpleadoByEdad(int edad) {
		return repo.findByEdad(edad);
	}

	public List<Empleado> traerFechaIngreso(String fechaIngreso) {
		return repo.findByFechaIngreso(fechaIngreso);
	}
	
	public List<Empleado> traerFechaSalida(String fechaSalida) {
		return repo.findByFechaSalida(fechaSalida);
	}
	
	public void actualizarEmpleado(Empleado empleado, int id) {
		repo.save(empleado);
	}
	
	public void actualizarFechaIngreso(Empleado empleado, int id, Timestamp fechaIngreso) {
		repo.save(empleado);
	}
	
	public void actualizarFechaSalida(Empleado empleado, int id, Timestamp fechaSalida) {
		repo.save(empleado);
	}

	public void deleteById(int id) {
		repo.deleteById(id);
	}

}
