package com.fatec.produto.model;

public class Catalogo {
	private Long id;
	private String descricao;
	private String Categoria;
	private double custo;
	private int quantidadeNoEstoque;
	private byte[] imagem;
	public Catalogo(Long id, String descricao, String categoria, double custo, int quantidadeNoEstoque, byte[] imagem) {
		this.id = id;
		this.descricao = descricao;
		Categoria = categoria;
		this.custo = custo;
		this.quantidadeNoEstoque = quantidadeNoEstoque;
		this.imagem = imagem;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public int getQuantidadeNoEstoque() {
		return quantidadeNoEstoque;
	}
	public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
		this.quantidadeNoEstoque = quantidadeNoEstoque;
	}
	public byte[] getImagem() {
		return imagem;
	}
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	

}
