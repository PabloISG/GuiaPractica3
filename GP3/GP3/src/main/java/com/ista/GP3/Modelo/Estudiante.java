package com.ista.GP3.Modelo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Estudiantes")
public class Estudiante {
	
	@Id
	private String id;
	private String nombre;
	private Long numero;
	private String correo;
	public List<String> cursoLista;
	private float gpa;
	
	
	//Constructores
	public Estudiante() {
		
	}
	
	public Estudiante(String id, String nombre, Long numero, String correo, List<String> cursoLista, Float gpa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
		this.correo = correo;
		this.cursoLista = cursoLista;
		this.gpa = gpa;
	}
	
	//GETTERS Y SETTERS
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public List<String> getCursoLista() {
		return cursoLista;
	}

	public void setCursoLista(List<String> cursoLista) {
		this.cursoLista = cursoLista;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	
	
}
