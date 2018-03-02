package sistema.modelos;

public class Professor {

	private int id;
	private String nome;
	private String disciplina;
	
	public int getMatricula() {
		return id;
	}
	public void setMatricula(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return disciplina;
	}
	public void setCurso(String curso) {
		this.disciplina = curso;
	}
	
}
