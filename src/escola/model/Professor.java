package escola.model;

public class Professor extends Pessoa{

	private String disciplina;
	
	private String formacao;

	//m�todo construtor
	public Professor(int id, String nome, int idade, String sexo, String email, String telefone, 
			String disciplina, 	String formacao) {
		super(id, nome, idade, sexo, email, telefone);//estou retornando os atributos da classe m�e
		this.disciplina = disciplina;
		this.formacao = formacao;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	//polimorfismo
	//void n�o tem return
	@Override // anota��o que evita escrita errada do m�todo que vem da classe m�e e permite sobreescrita 
	public void visualizar() {
		super.visualizar();//estamos recuperando o m�todo visualizar 
		System.out.println("Disciplina: "+ this.disciplina);//sa�da do atributo que � unico para o Professor
	}
	
	
}
