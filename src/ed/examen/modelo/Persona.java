package ed.examen.modelo;

/**
 * @author Luis Mengíbar Sandoval
 * @since 1.0
 * @version 0.0.1
 *
 */
public class Persona {

	private String dni;
	private String nombre;
	private String apellido1;

	public Persona() {
	}

	/*
	 * Documentar y crear test unitario
	 */
	/**
	 * Constructor en que crearemos un nuevo objeto con el que operar.
	 * 
	 * @param dni       numero de identificación de la persona que queremos añadir
	 *                  (siguiendo los parametros establecidos).
	 * @param nombre    nombre de la persona a añadir en el constructor.
	 * @param apellido1 primer apellido de la persona especificada en el
	 *                  constructor.
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	/*
	 * Documentar y crear test unitario
	 */
	/**
	 * Metodo de la clase persona que nos devuelve el dni de un constructor.
	 */
	public String getDni() {
		return dni;
	}

	/*
	 * Documentar y crear test unitario
	 */
	/**
	 * Metodo para cambiar el dni de un constructor.
	 * 
	 * @param dni numero de identificacion de la persona a la que se lo queremos
	 *            cambiar.
	 * @throws Exception cuando el ultimo caracter del dni no es una letra.
	 */
	public void setDni(String dni) throws Exception {
		// comprobacion de si el ultimo caracter es una letra
		if (Character.isLetter(dni.charAt(dni.length() - 1))) {// Error solucionado, hacia falta coger el dni.length-1
			this.dni = dni;
		} else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}

	/*
	 * Documentar y crear test unitario
	 */
	/**
	 * Metodo que devuelve el nombre del constructor al que llamamos (con el metodo)
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	/*
	 * Documentar y crear test unitario
	 */
	/**
	 * Metodo con el cambiamos el nombre de un contructor.
	 * 
	 * @param nombre parametro que cambiamos.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * Documentar y crear test unitario
	 */
	/**
	 * Metodo que devuelve el primer apellido establecido en el contructor al que
	 * llamamos
	 */
	public String getApellido1() {
		return apellido1;
	}

	/*
	 * Documentar y crear test unitario
	 */
	/**
	 * Metodo para cambiar el primer apellido de un constructor
	 * 
	 * @param apellido1 parametro que cambiamos del constructor
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
