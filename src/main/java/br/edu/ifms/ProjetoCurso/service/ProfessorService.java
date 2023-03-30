package br.edu.ifms.ProjetoCurso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.ProjetoCurso.model.Professor;
import br.edu.ifms.ProjetoCurso.repository.RepositoryProfessor;


@Service
public class ProfessorService {
	    @Autowired
		private RepositoryProfessor repositoryProfessor;
	    
	    
	    public Professor buscarId(Long id) {
	    	Optional<Professor> profe = repositoryProfessor.findById(id);
	    	return profe.orElseThrow();
	    }
		
		public List<Professor> buscarTodos(){
			return repositoryProfessor.findAll();
		}
		public Professor cadastrar(Professor prof) {
			prof.setId(null);
			return repositoryProfessor.save(prof);
		}
		
		public Professor atualizar(Professor prof) {
			Professor profe = buscarId(prof.getId());
			profe.setNome(profe.getNome());
			return repositoryProfessor.save(profe);
		}
		
		
		

}
