package Clinica;

import java.util.ArrayList;
import java.util.List;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClinicaC axiz = new ClinicaC();
		axiz.setNombre("Clinica AXIZ");
		
		List<Cita> citas = new ArrayList<>();
		
		//------------------------------//
		Persona awi = new Persona();
		awi.setDni("42435454");
		awi.setNombre("Awi");
		awi.setEdad("35");
		
		Cita cita1 = new Cita();
		cita1.setIdCita("1");
		cita1.setPersona(awi);
		citas.add(cita1);
		
		
		//------------------------------//
		Persona rip = new Persona();
		rip.setDni("41235687");
		rip.setEdad("34");
		rip.setNombre("Ripito");
		
		Cita cita2 = new Cita();
		cita2.setIdCita("2");
		cita2.setPersona(rip);
		citas.add(cita2);
				
		
		//------------------------------//
		Persona rene = new Persona();
		rene.setDni("43212065");
		rene.setEdad("36");
		rene.setNombre("Rene");
		
		Cita cita3 = new Cita();
		cita3.setIdCita("3");
		cita3.setPersona(rene);
		citas.add(cita3);
		
		//-----------------------------//
		Persona princeso = new Persona();
		princeso.setDni("47896523");
		princeso.setEdad("30");
		princeso.setNombre("Princeso");
	
		Cita cita4 = new Cita();
		cita4.setIdCita("4");
		cita4.setPersona(princeso);
		citas.add(cita4);
		
		Especialidad especialidad1 = new Especialidad();
		especialidad1.setNombre("webolorogo");
		especialidad1.setCosto(50);
		
		Especialidad especialidad2 = new Especialidad();
		especialidad2.setNombre("ginecologo");
		especialidad2.setCosto(55);
		
		Especialidad especialidad3 = new Especialidad();
		especialidad3.setNombre("cardiologo");
		especialidad3.setCosto(60);
		
		Especialidad especialidad4 = new Especialidad();
		especialidad4.setNombre("oftalmologo");
		especialidad4.setCosto(65);
		
		Local local1 =new Local();
		local1.setDistrito("surco");
		local1.setDireccion("benavides");
		local1.setNombre("Clinica Benavides");
		
		Local local2 = new Local();
		local2.setDireccion("caminos del inca");
		local2.setDistrito("surco");
		local2.setNombre("clinica inca");
		
		Local local3 = new Local();
		local3.setDistrito("Chorrillos");
		local3.setDireccion("avenida el sol");
		local3.setNombre("clinica chorrillos");
		
		Local local4 = new Local();
		local4.setDistrito("san juan");
		local4.setDireccion("avenida san juan");
		local4.setNombre("clinica ciudad");
		
		
	
		axiz.setCitas(citas);
		
		List<Cita> listaCitas = new ArrayList<>();
		listaCitas = axiz.getCitas();
		
		for (int i = 0; i < listaCitas.size(); i++) {
			//Obtengo el empleado de la iteracion i
			
		
		
	}
	}

}