package br.edu.ifms.ProjetoCurso.Dto;

public class ProfessorDto {
	
	
	private Long id;
	private String nome;
	

	public ProfessorDto() {
		// TODO Auto-generated constructor stub
	}


	public ProfessorDto(Long id, String nome) {
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
	
	
}
