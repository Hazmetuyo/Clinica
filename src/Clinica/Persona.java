package Clinica;

public class Persona {

		private String nombre;
		private String dni;
		private String edad;
		
	public Persona(String nombre, String dni, String edad) {
			
			this.nombre = nombre;
			this.dni=dni;
			this.edad = edad;
		}
		public Persona() {
			
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getEdad() {
			return edad;
		}
		public void setEdad(String edad) {
			this.edad = edad;
		}
		
		
		
		
		
		
		
}

