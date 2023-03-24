package br.edu.ifms.ProjetoCurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.ProjetoCurso.model.Professor;


public interface RepositoryProfessor extends JpaRepository <Professor, Long> {

}
