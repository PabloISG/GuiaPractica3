package com.ista.GP3.Services;

import java.util.List;

import com.ista.GP3.Modelo.Estudiante;

public interface IEstudianteService {
	
	List<Estudiante> findAll();
	Estudiante findBynumero (Long numero);
	Estudiante findBycorreo(String correo);
	List<Estudiante> findByOrderBygpa();
	void saveOrUpdateStudent(Estudiante estudiante);
	void deleteEstudiante (String Id);
	List<Estudiante> findAllByOrderByGpaDesc();
}
