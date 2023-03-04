package com.ista.GP3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.GP3.Modelo.Estudiante;
import com.ista.GP3.Services.IEstudianteService;

@RestController
@RequestMapping("/Estudiantes")
public class EstudianteController {

	@Autowired
	private IEstudianteService estudianteService;
	
	@GetMapping(value = "/ListaEstudiantes")
	public List<Estudiante> getAllEstudiantes(){
		return estudianteService.findAll();
	}
	
	@GetMapping(value = "/{numero}")
	public Estudiante getEstudianteBynumero(@PathVariable("numero") Long numero) {
		return estudianteService.findBynumero(numero);
	}
	
	@GetMapping(value = "/{correo}")
	public Estudiante getEstudianteBycorreo(@PathVariable("correo") String correo) {
		return estudianteService.findBycorreo(correo);
	}
	
	@GetMapping(value = "/orderByGpa")
	public List<Estudiante> findAllOrderByGpaDesc (){
		return estudianteService.findAllByOrderByGpaDesc();
	}
	
	@PostMapping(value = "/crearEst")
	public ResponseEntity<?> SaveOrUpdateEstudiante(@RequestBody Estudiante estudiante){
		estudianteService.saveOrUpdateStudent(estudiante);
		return new ResponseEntity<Object>("Estudiante creado con exito", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{numero}")
	private void deleteEstudiante(@PathVariable Long numero) {
		estudianteService.deleteEstudiante(estudianteService.findBynumero(numero).getId());
	}
}
