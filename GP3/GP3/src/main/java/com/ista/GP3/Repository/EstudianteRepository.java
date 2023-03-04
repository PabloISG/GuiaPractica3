package com.ista.GP3.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.GP3.Modelo.Estudiante;

public interface EstudianteRepository extends MongoRepository<Estudiante, String>{

	Estudiante findBynumero (Long numero);
	Estudiante findBycorreo (String correo);
	List<Estudiante> findByOrderBygpa();
	List<Estudiante> findAllByOrderByGpaDesc();
	
}
