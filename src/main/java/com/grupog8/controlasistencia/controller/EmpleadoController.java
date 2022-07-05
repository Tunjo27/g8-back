package com.grupog8.controlasistencia.controller;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupog8.controlasistencia.entity.Empleado;
import com.grupog8.controlasistencia.service.IEmpleadoService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
public class EmpleadoController {

	@Autowired
	IEmpleadoService empleadoService;
	
	@PostMapping("/add-empleado")
	public int guardarEmpleado(@RequestBody Empleado empleado) {
		empleadoService.guardarActualizarEmpleado(empleado);
		return empleado.getId();
	}
	
	@GetMapping("/find-all-empleados")
	public List<Empleado> traerEmpleados(){
		return empleadoService.traerEmpleados();
	}
	
	@GetMapping("/encontrar-empleado/{id}")
	public Optional<Empleado> traerEmpleadoById(@PathVariable int id) {
		return empleadoService.traerEmpleadoById(id);
	}
	
	@GetMapping("/find-empleado/{cargo}")
	public List<Empleado> traerEmpleadoByCargo(@PathVariable String cargo) {
		return empleadoService.traerEmpleadoByCargo(cargo);
	}
	
	@GetMapping("/filtrar-empleado/{edad}")
	public List<Empleado> traerEmpleadoByEdad(@PathVariable int edad) {
		return empleadoService.traerEmpleadoByEdad(edad);
	}
	
	@GetMapping("/obtener-fecha-ingreso/{fechaIngreso}")
	public List<Empleado> obtenerFechaIngreso(@PathVariable String fechaIngreso){
		return empleadoService.traerFechaIngreso(fechaIngreso);
	}
	
	@GetMapping("/obtener-fecha-salida/{fechaSalida}")
	public List<Empleado> obtenerFechaSalida(@PathVariable String fechaSalida){
		return empleadoService.traerFechaSalida(fechaSalida);
	}
	
	@PutMapping("/update/{id}")
	public Empleado actualizarEmpleado(@RequestBody Empleado empleado) {
		empleadoService.guardarActualizarEmpleado(empleado);
		return empleado;
	}
	
	@PutMapping("/update-fecha-inicial/{id}")
	public Empleado actualizarFechaIngreso(@RequestBody Empleado empleado, @PathVariable int id) {
		Optional<Empleado> myEmpleado = traerEmpleadoById(id);
	    if(myEmpleado.isEmpty()){
	    	return new Empleado();
	    }
		Empleado empleadoUpdate = myEmpleado.get();
		empleadoUpdate.fechaIngreso = Timestamp.from((new java.util.Date()).toInstant());
		empleadoService.guardarActualizarEmpleado(empleadoUpdate);
		return empleadoUpdate;
	}
	
	@PutMapping("/update-fecha-salida/{id}")
	public Empleado actualizarFechaSalida(@RequestBody Empleado empleado, @PathVariable int id){
		Optional<Empleado> myEmpleado = traerEmpleadoById(id);
	    if(myEmpleado.isEmpty()){
	    	return new Empleado();
	    }
		Empleado empleadoUpdate = myEmpleado.get();
		empleadoUpdate.fechaSalida = Timestamp.from((new java.util.Date()).toInstant());
		empleadoService.guardarActualizarEmpleado(empleadoUpdate);
		return empleadoUpdate;
	}
	
	@DeleteMapping("/delete/{id}")
	public void borrarEmpleado(@PathVariable int id) {
		empleadoService.deleteById(id);
	}
	
}
