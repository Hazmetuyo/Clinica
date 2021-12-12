package Clinica;

public class Local {
	
	
		private String nombre;
		private String direccion;
		private String distrito;
		
		public Local(String nombre, String direccion, String distrito) {
			
			this.nombre = nombre;
			this.direccion=direccion;
			this.distrito = distrito;
		}
		public Local() {
			
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getDistrito() {
			return distrito;
		}
		public void setDistrito(String distrito) {
			this.distrito = distrito;
		}
		
		
		

}
