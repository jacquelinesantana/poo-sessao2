package escola;

import escola.model.Aluno;
import escola.model.Pessoa;
import escola.model.Professor;

public class TestandoEscola {

	public static void main(String[] args) {
		// chamando as classes e instanciando os objetos
		
		Aluno a = new Aluno(1, "Ellen Silva", 29, "Feminino", "ellen.generation@gmail.com", 
				"(11)4002-8922", "Maria", 2024, "(11)4002-8922");
		
		Professor p = new Professor(2, "Thiago", 28, "Masculino", "thiagodapraiagrande@gmail.com",
				"(11)5591-7922", "Full stack", "Vida");
		
		
		//Pessoa x = new Pessoa(5, "Vinicius", 25, "Masculino", "vinicius_kbc@hotmail.com", "(11)9.7070-7070");
		
		a.visualizar();
		p.visualizar();
		
		
		
	}

}
