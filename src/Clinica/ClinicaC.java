package Clinica;

import java.util.List;

public class ClinicaC {
	
	private String nombre;
	private List<Cita> citas;
	
	public List<Cita> getCitas(){
		return citas;
	}
	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

}
