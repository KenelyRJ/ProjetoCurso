package br.edu.ifms.ProjetoCurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.ProjetoCurso.model.Professor;

@Repository
public interface RepositoryProfessor extends JpaRepository <Professor, Long> {

}
