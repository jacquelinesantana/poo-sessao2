package escola.model;

//classe abstrata - não pode ser instanciada
public abstract class Pessoa {

	//atributos
	
	private int id;
	
	private String nome;
	
	private int idade;
	
	private String sexo;
	
	private String email;
	
	private String telefone; //(11)9.9999-0000

	//metodo construtor
	public Pessoa(int id, String nome, int idade, String sexo, String email, String telefone) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.email = email;
		this.telefone = telefone;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//método tem função de exibir os dados do objeto Pessoa
	public void visualizar() {
		System.out.println("\n\n******************************************");
		System.out.println(" ********* Dados do Cadastro:"+this.id+" *********");
		System.out.println("Nome: "+ this.nome + " telefone: " + this.telefone);
	}
	
}
