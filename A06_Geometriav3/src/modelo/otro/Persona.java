package modelo.otro;

public class Persona extends Ente {

	int id;
	String nombre;
	String apellidos;
	String dni;
	String telefono;
	
	public Persona(int id) {
		this.id = id;
	}
	
	public Persona(int id, String nombre, String apellidos) {
		this(id);
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Persona(int id, String nombre, String apellidos, String dni) {
		this(id, nombre, apellidos);
		this.dni = dni;
	}
	
	public Persona(int id, String nombre, String apellidos, String dni, String telefono) {
		this(id, nombre, apellidos, dni);
		this.telefono = telefono;
	}
		
}
