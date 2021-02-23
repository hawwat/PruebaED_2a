package ed.examen.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import sun.security.util.Length;

/**
 * @author Luis Mengíbar Sandoval
 * @since 1.0
 * @version 0.0.1
 * 
 */
public class Curso {

	private List<Persona> listaAlumnos;

	// Documentar y crear test unitario

	/**
	 * Metodo para eliminar un alumno introduciendo su DNI.
	 * 
	 * @param dni numero de identificacion de la persona que queremos eliminar.
	 * @throws Exception cuando el dni no dispone de 9 caracteres.
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni

			for (Iterator iterator = listaAlumnos.iterator(); iterator.hasNext();) {// codigo refactorizado
				Persona persona = (Persona) iterator.next();
				if (dni == persona.getDni()) {
					listaAlumnos.remove(persona);
					break;
				}
			}

		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}

	}

	/*
	 * Documentar y crear test unitario
	 */
	/**
	 * Método para añadir una persona al curso.
	 * 
	 * @param p persona que queremos añadir al curso.
	 * 
	 */
	public void aniadirAlumno(Persona p) {

		listaAlumnos.add(p);

	}

	/*
	 * Documentar y crear test unitario
	 */
	/**
	 * Metodo para comprobar que una persona la tenemos registrada
	 * 
	 * @param dni con este parametro comprobamos la existencia de la persona si
	 *            tenemos al buscar encontramos su dni.
	 * 
	 */
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/*
	 * Documentar y crear test unitario
	 */
	/**
	 * Constructor de la clase curso
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/*
	 * Documentar y crear test unitario
	 */
	/**
	 * Metodo para comprobar el numero de alumnos que tenemos dentro de nuestra
	 * lista.
	 * 
	 * El metodo devuelve el numero de alumnos que contiene.
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
