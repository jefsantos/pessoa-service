package com.omelhordochile.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "tabela_empresa")
@Entity
public class EmpresaModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_empresa;
	String nome;


//	@OneToMany(mappedBy = "empresaModel")
//	private List<Carro> carros = new ArrayList<>(); 

	public EmpresaModel() {

	}

	public EmpresaModel(int id_empresa, String nome, String modeloCarro, int quantidadeTotal, int quantidadeLivre
			) {
		super();
		this.id_empresa = id_empresa;
		this.nome = nome;

	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



}
