package com.foxstore.security.repository.projection;

import com.foxstore.security.domain.Especialidade;
import com.foxstore.security.domain.Medico;
import com.foxstore.security.domain.Paciente;

public interface HistoricoPaciente {

	Long getId();
	
	Paciente getPaciente();
	
	String getDataConsulta();
	
	Medico getMedico();
	
	Especialidade getEspecialidade();
}
