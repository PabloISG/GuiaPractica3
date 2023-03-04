package com.ista.GP3.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.GP3.Modelo.Estudiante;
import com.ista.GP3.Repository.EstudianteRepository;

@Service
public class IEstudianteImpl implements IEstudianteService {

	@Autowired
	private EstudianteRepository estudianteRepository;
	
	@Override
	public List<Estudiante> findAll() {
		return estudianteRepository.findAll();
	}

	@Override
	public Estudiante findBynumero(Long numero) {
		return estudianteRepository.findBynumero(numero);
	}

	@Override
	public Estudiante findBycorreo(String correo) {
		return estudianteRepository.findBycorreo(correo);
	}

	@Override
	public List<Estudiante> findByOrderBygpa() {
		return estudianteRepository.findByOrderBygpa();
	}

	@Override
	public void saveOrUpdateStudent(Estudiante estudiante) {
		estudianteRepository.save(estudiante);
	}

	@Override
	public void deleteEstudiante(String Id) {
		estudianteRepository.deleteById(Id);
	}

	@Override
	public List<Estudiante> findAllByOrderByGpaDesc() {
		return estudianteRepository.findAllByOrderByGpaDesc();
	}

}
