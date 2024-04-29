package escola.model;

public class Professor extends Pessoa{

	private String disciplina;
	
	private String formacao;

	//método construtor
	public Professor(int id, String nome, int idade, String sexo, String email, String telefone, 
			String disciplina, 	String formacao) {
		super(id, nome, idade, sexo, email, telefone);//estou retornando os atributos da classe mãe
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
	//void não tem return
	@Override // anotação que evita escrita errada do método que vem da classe mãe e permite sobreescrita 
	public void visualizar() {
		super.visualizar();//estamos recuperando o método visualizar 
		System.out.println("Disciplina: "+ this.disciplina);//saída do atributo que é unico para o Professor
	}
	
	
}
