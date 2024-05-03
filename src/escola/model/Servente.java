package escola.model;

public class Servente extends Pessoa {

	private String funcao;
	
	
	
	


	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Servente(int id, String nome, int idade, String sexo, String email, String telefone, String funcao) {
		super(id, nome, idade, sexo, email, telefone);
		this.funcao = funcao;
	}

	@Override
	public void acompanharCanvas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float salarioLiquido(float salario) {
		// calculo do salario liquido do servente
		return salario - 80;
	}
	
	

}
