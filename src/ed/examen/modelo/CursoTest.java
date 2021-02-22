package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {
	Persona p = new Persona("18475280R", "Pepe", "Alvarez");
	Curso c = new Curso();

	@Test
	public void testEliminarAlumno() {
		int size = c.numeroAlumnos();

		try {
			c.eliminarAlumno(p.getDni());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			fail("error");
		}
		int size2 = c.numeroAlumnos();
		assertEquals(size, size2);
		
		
		
		// clase invalida
		Boolean throwException = false;
		try {
			c.eliminarAlumno("184752800R");//Pongo un número de más
		} catch (Exception e) {
			// TODO: handle exception

			throwException = true;
		}
		assertTrue(throwException);
	}

	@Test
	public void testAniadirAlumno() {
		try {
			c.aniadirAlumno(p);

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Test
	public void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	public void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
