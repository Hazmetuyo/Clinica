package Clinica;

public class Especialidad {

		private String nombre;
		private double costo;
		
	public Especialidad(String nombre, double costo) {
			
			this.nombre = nombre;
			this.costo= costo;
			
		}
		public Especialidad() {
			
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getCosto() {
			return costo;
		}
		public void setCosto(double costo) {
			this.costo = costo;
		}
		
		
		
}
