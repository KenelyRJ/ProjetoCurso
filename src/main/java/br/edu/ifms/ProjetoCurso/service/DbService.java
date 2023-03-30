package br.edu.ifms.ProjetoCurso.service;


import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.ProjetoCurso.model.Professor;
import br.edu.ifms.ProjetoCurso.model.Turma;
import br.edu.ifms.ProjetoCurso.repository.RepositoryProfessor;
import br.edu.ifms.ProjetoCurso.repository.RepositoryTurma;

@Service
public class DBService {

	@Autowired
	RepositoryProfessor repositoryProfessor;
	@Autowired
	RepositoryTurma repositorytTurma;

	public void instantiateTestDatabase() throws ParseException {

		// referencia depois instancia
		Professor prof1 = new Professor(null, "Carlos", "porturgues");
		Professor prof2 = new Professor(null, "Jean", "java");
		Professor prof3 = new Professor(null, "Françoso", "javascript");
		
		
		Turma tr1 = new Turma(null, "32214");
		Turma tr2 = new Turma(null, "3221");
		Turma tr3 = new Turma(null, "3");
		Turma tr4 = new Turma(null, "14");
		
		tr1.getProfessores().addAll(Arrays.asList(prof1, prof2));
		tr2.getProfessores().addAll(Arrays.asList(prof1, prof3));
		tr3.getProfessores().addAll(Arrays.asList(prof2));
		tr4.getProfessores().addAll(Arrays.asList(prof1));
		
		
		
		repositoryProfessor.saveAll(Arrays.asList(prof1,prof2, prof3));
		repositorytTurma.saveAll(Arrays.asList(tr1, tr2, tr3, tr4));
		
		
	

		// TODO Auto-generated method stub

	}

}
