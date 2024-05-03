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

	@Override
	public void acompanharCanvas() {
		// TODO Auto-generated method stub
		
		System.out.println("Olá professor(A), verifique diariamente as entregas no canvas.");
	}

	public void legal() {
		System.out.println("O professor é legal");
	}
	
	public void bolinha() {
		
	}
	
	@Override //override anotação do java / toda vez que ele aparece ele verificar se o metodo abaixo existe na classe mãe
	public float salarioLiquido(float salario) {
		// calcular o salario do professor
		return salario - 150;
	}
	
	
}
