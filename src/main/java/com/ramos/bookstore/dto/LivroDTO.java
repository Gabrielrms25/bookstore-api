package com.ramos.bookstore.dto;

import java.io.Serializable;

import com.ramos.bookstore.domain.Livro;

public class LivroDTO implements Serializable {
	
	private static final long serialVersionUId = 1L;
	
	private Integer id;
	private String titulo;
	
	public LivroDTO() {
		super();
	}
	
	public LivroDTO(Livro obj) {
		super();
		this.id = obj.getId();
		this.titulo = obj.getTitulo();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
}