package com.practica.solucion;

public class AlumnoDAM extends Alumno {
	//encapsulamiento
	private String nombre;
	private String correo;
	private float nota;
	
	public AlumnoDAM(String nombre, String correo, float nota) {
		super(correo, correo, nota);
		this.nombre = nombre;
		this.correo = correo;
		this.nota = nota;
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
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	

}
