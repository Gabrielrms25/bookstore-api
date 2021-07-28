package com.ramos.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramos.bookstore.domain.Categoria;
import com.ramos.bookstore.domain.Livro;
import com.ramos.bookstore.repositories.CategoriaRepository;
import com.ramos.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	
	public void instaciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null,"Informatica", "Livro de TI");
		Categoria cat2 = new Categoria(null,"Exatas","Livros de Exatas");
		
		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
		Livro l2 = new Livro(null,"Fundamentos da Matematica Elementar","Iezzi","Conjuntos e Funcoes",cat2);
		
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		cat2.getLivros().addAll(Arrays.asList(l2));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		this.livroRepository.saveAll(Arrays.asList(l1,l2));
		
		
	}
	
	
}
