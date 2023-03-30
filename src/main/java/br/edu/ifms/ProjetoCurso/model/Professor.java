package br.edu.ifms.ProjetoCurso.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Professor  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	private String nome;
	@ManyToMany(mappedBy = "professores")
	private List<Turma> turmas = new ArrayList<Turma>();
	public Professor(Long id, String nome, String disciplina) {
			super();
			this.id = id;
			this.nome = nome;
		
			
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}





		public void setNome(String nome) {
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
			Professor other = (Professor) obj;
			return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
		}





		







}
