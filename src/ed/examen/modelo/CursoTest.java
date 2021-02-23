package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {
	Persona p = new Persona("18475280R", "Pepe", "Alvarez");

	Persona p1 = new Persona("184752800R", "Pepe", "Alvarez");
	Curso c = new Curso();

	@Test
	public void testEliminarAlumno() {
		int size = c.numeroAlumnos();

		try {
			c.aniadirAlumno(p);
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
			c.aniadirAlumno(p1);
			c.eliminarAlumno(p1.getDni());// Pongo un número de más
		} catch (Exception e) {
			// TODO: handle exception

			throwException = true;
		}
		assertTrue(throwException);
	}

	@Test
	public void testAniadirAlumno() {
		c.aniadirAlumno(p);
		assertTrue(c.estaRegistrado(p.getDni()));
	}

	@Test
	public void testEstaRegistrado() {
		c.aniadirAlumno(p);
		assertTrue(c.estaRegistrado(p.getDni()));
	}

	@Test
	public void testCurso() {
		assertTrue(c.numeroAlumnos() == 0);
	}

	@Test
	public void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
