package Clinica;

public class Horario {
	
	private String codigo;
	private String hora;
	private String persona;
	
	public Horario(String codigo, String hora, String persona) {
		
		this.codigo = codigo;
		this.hora=hora;
		this.persona = persona;
	}
	public Horario() {
		
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	

}
