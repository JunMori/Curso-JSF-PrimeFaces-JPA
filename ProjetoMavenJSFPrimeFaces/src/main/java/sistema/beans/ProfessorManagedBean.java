package sistema.beans;

import java.util.List;

import sistema.modelos.Professor;
import sistema.service.ProfessorService;

public class ProfessorManagedBean {
	
	private Professor professor = new Professor();
	private ProfessorService service = new ProfessorService();
	
	
	public void salvar()
	{
		service.salvar(professor);
		professor = new Professor();
		
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setAluno(Professor professor) {
		this.professor = professor;
	}

	public List<Professor> getProfessore() {
		return service.getProfessores();
	}
	
	
	

}
