package escola.model;

//classe não pode ser herdada - classe aluno é final
public final class Aluno extends Pessoa {
	
	private String nomeResponsavel;
	
	private int anoMatricula;
	
	private String telResponsavel;

	//método construtor
	public Aluno(int id, String nome, int idade, String sexo, String email, String telefone, 
			String nomeResponsavel, int anoMatricula, String telResponsavel) {
		super(id, nome, idade, sexo, email, telefone);
		this.nomeResponsavel = nomeResponsavel;
		this.anoMatricula = anoMatricula;
		this.telResponsavel = telResponsavel;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public int getAnoMatricula() {
		return anoMatricula;
	}

	public void setAnoMatricula(int anoMatricula) {
		this.anoMatricula = anoMatricula;
	}

	public String getTelResponsavel() {
		return telResponsavel;
	}

	public void setTelResponsavel(String telResponsavel) {
		this.telResponsavel = telResponsavel;
	}
	
	//polimorfismo
		//void não tem return
		@Override // anotação que evita escrita errada do método que vem da classe mãe e permite sobreescrita 
	public void visualizar() {
		super.visualizar();//recupera o método visualizar da classe mãe
		System.out.println("Nome do Responsável: "+ this.nomeResponsavel);
	}
	
	
	
}
