package luis.ortiz;

public class Paciente {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}
	
	public Paciente(String nombre, String apellido,int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

}
