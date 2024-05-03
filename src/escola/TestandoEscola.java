package escola;

import escola.controller.AlunoController;
import escola.model.Aluno;
import escola.model.Pessoa;
import escola.model.Professor;
import escola.model.Servente;

public class TestandoEscola {

	public static void main(String[] args) {
		// chamando as classes e instanciando os objetos
		
		Aluno a = new Aluno(1, "Ellen Silva", 29, "Feminino", "ellen.generation@gmail.com", 
				"(11)4002-8922", "Maria", 2024, "(11)4002-8922");
		
		Professor p = new Professor(2, "Thiago", 28, "Masculino", "thiagodapraiagrande@gmail.com",
				"(11)5591-7922", "Full stack", "Vida");
		
		
		//Pessoa x = new Pessoa(5, "Vinicius", 25, "Masculino", "vinicius_kbc@hotmail.com", "(11)9.7070-7070");
		
		a.visualizar();
		a.acompanharCanvas();
		//a.legal();
		
		p.visualizar();
		p.acompanharCanvas();
		p.legal();
		
		//----- chamando nossa classe controller
		AlunoController alunoContr = new AlunoController();
		alunoContr.fazerExercicio();
		
		
		System.out.println("o salario da bolsa do participante é: " + a.salarioLiquido(250.0f));
		
		System.out.println("O salario do professor é: " + p.salarioLiquido(10000.00f));
		
		Servente s = new Servente(2, "Cleber", 18, "Masculino", "cleber@gmail.com",
				"(11)5591-7922", "Limpeza");
		
		s.salarioLiquido(8000.0f);
		
	}

}
