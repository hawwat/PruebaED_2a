package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luis Mengíbar Sandoval
 * @since 0.1
 * @version 0.0.1
 *
 */
public class PersonaTest {

	Persona p = new Persona("18475280R", "Pepa", "Hernadez");

	@Test
	public void testPersonaStringStringString() {
		assertEquals(p.getDni(), "18475280R");
		assertEquals(p.getNombre(), "Pepa");
		assertEquals(p.getApellido1(), "Hernadez");
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
		p.setApellido1("Perez");
		assertEquals(p.getApellido1(), "Perez");
	}

}
