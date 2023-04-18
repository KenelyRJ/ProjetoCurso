package br.edu.ifms.ProjetoCurso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.ProjetoCurso.model.Turma;
import br.edu.ifms.ProjetoCurso.repository.RepositoryTurma;


@Service
public class TurmaService {
	    @Autowired
		private RepositoryTurma repositoryTurma;
	    
	    
	    public Turma buscarId(Long id) {
	    	Optional<Turma> t = repositoryTurma.findById(id);
	    	return t.orElseThrow();
	    }
		
		public List<Turma> buscarTodos(){
			return repositoryTurma.findAll();
		}
		public Turma cadastrar(Turma tr) {
			tr.setId(null);
			return repositoryTurma.save(tr);
		}
		

		public Turma atualizar(Turma tra) {
			Turma tr = buscarId(tra.getId());
			tra.setNome(tra.getNome());
			return repositoryTurma.save(tra);
		
		
		}
		public void remover(Long id) {
			buscarId(id);
			 repositoryTurma.deleteById(id);
		}
}
