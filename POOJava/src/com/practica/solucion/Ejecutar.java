package com.practica.solucion;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoDAM ahijado=new AlumnoDAM("ahijado", "dd@gmail.com", 7);
		AlumnoDAM nieto=new AlumnoDAM("nieto", "dd@gmail.com", 7.5f);
		AlumnoDAW jesus=new AlumnoDAW("jesus", "dd@gmail.com", 6.75f);
		AlumnoDAW adrian=new AlumnoDAW("adrían", "dd@gmail.com", 5);
		
		Alumno[] alumnos= {ahijado,nieto,jesus,adrian};
		float nota=0;
		for(int i=0;i<alumnos.length;i++) {
			System.out.println(alumnos[i].getNota());
			nota+=alumnos[i].getNota();
			float notaMedia=nota/alumnos.length;
			System.out.println("la nota media del grupo es "+notaMedia);
		}
		
	}

}
