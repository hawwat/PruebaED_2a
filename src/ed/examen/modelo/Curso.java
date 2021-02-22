package ed.examen.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Curso {

	private List<Persona> listaAlumnos;

	/*
	 * Documentar y crear test unitario
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
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/*
	 * Documentar y crear test unitario
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
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/*
	 * Documentar y crear test unitario
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
