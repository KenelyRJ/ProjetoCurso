package br.edu.ifms.ProjetoCurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.ProjetoCurso.model.Turma;
@Repository
public interface RepositoryTurma extends JpaRepository<Turma, Long> {

}
