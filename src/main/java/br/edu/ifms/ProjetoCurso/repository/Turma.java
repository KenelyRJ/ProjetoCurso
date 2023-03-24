package br.edu.ifms.ProjetoCurso.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class Turma {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@ManyToMany
	@JoinTable(			
			name="Turma_profe",
			joinColumns = @JoinColumn(name="professor_id"),
			inverseJoinColumns = @JoinColumn(name= "disciplina_id")			
			)
	private List<Professor> professores = new ArrayList<Professor>();
	
	public Turma() {
		// TODO Auto-generated constructor stub
	}
	

	public Turma(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	
	
	

}
