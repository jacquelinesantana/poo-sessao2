package escola.model;

//classe n�o pode ser herdada - classe aluno � final
public final class Aluno extends Pessoa {
	
	private String nomeResponsavel;
	
	private int anoMatricula;
	
	private String telResponsavel;

	//m�todo construtor
	public Aluno(int id, String nome, int idade, String sexo, String email, String telefone, 
			String nomeResponsavel, int anoMatricula, String telResponsavel) {
		super(id, nome, idade, sexo, email, telefone);
		this.nomeResponsavel = nomeResponsavel;
		this.anoMatricula = anoMatricula;
		this.telResponsavel = telResponsavel;
	}
	
	public Aluno() {
		
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
		//void n�o tem return
		@Override // anota��o que evita escrita errada do m�todo que vem da classe m�e e permite sobreescrita 
	public void visualizar() {
		super.visualizar();//recupera o m�todo visualizar da classe m�e
		System.out.println("Nome do Respons�vel: "+ this.nomeResponsavel);
	}
	
	@Override
	public void acompanharCanvas() {
		System.out.println("Alune! Verifique o seu canvas diariamente, fa�a  o Barometro!");
	}

	@Override
	public float salarioLiquido(float salario) {
		// preciso definir um salario liquido para cumprir com o acordo da classe m�e
		
		return salario -10;
	}

	
}
