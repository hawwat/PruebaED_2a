package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	Persona p = new Persona("18475280R", "Pepa", "Hernadez");

	@Test
	public void testPersonaStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDni() {
		// comprobamos que el dni de p es exactamente el que hemos indicado al crear la
		// persona
		assertEquals(p.getDni(), "18475280R");
	}

	@Test
	public void testSetDni() {
		try {
			p.setDni("00000000N");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(p.getDni(), "00000000N");

		Boolean throwException = false;
		try {
			p.setDni("101010101");
		} catch (Exception e) {
			// TODO: handle exception
			throwException = true;
		}
		assertTrue(throwException);
	}

	@Test
	public void testGetNombre() {
//comprobamos que el nombre es el mismo que acabamos de marcar
		assertEquals(p.getNombre(), "Pepa");
	}

	@Test
	public void testSetNombre() {

		p.setNombre("Alfreda");
		assertEquals(p.getNombre(), "Alfreda");
	}

	@Test
	public void testGetApellido1() {
		assertEquals(p.getApellido1(), "Hernadez");
	}

	@Test
	public void testSetApellido1() {
		fail("Not yet implemented");
	}

}
