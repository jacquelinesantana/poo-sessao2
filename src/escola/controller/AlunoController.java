package escola.controller;

import escola.repository.AlunoRepository;

public class AlunoController implements AlunoRepository{
	//camada de controle - os metodos abstratos da nossa interface
	
	@Override
	public void fazerExercicio() {
		// TODO Auto-generated method stub
		System.out.println("Você deve fazer os exercícios!");
		
	}

}
