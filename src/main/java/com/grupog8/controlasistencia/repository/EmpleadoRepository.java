package com.grupog8.controlasistencia.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grupog8.controlasistencia.entity.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer>{

	public List<Empleado> findByCargo(String cargo);
	
	public List<Empleado> findByEdad(int edad);
	
	public List<Empleado> findByFechaIngreso(String fechaIngreso);
	
	public List<Empleado> findByFechaSalida(String fechaSalida);

}
