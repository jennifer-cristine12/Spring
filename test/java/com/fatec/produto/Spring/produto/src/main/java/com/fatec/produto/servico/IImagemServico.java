package com.fatec.produto.Spring.produto.src.main.java.com.fatec.produto.servico;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.fatec.produto.model.Imagem;

public interface IImagemServico {
	public Optional<Imagem> salvar (MultipartFile arquivo, long id) throws IOException;
	public List<Imagem> getAll();
	public byte[] getImagem(String nomeArquivo);
	public byte[] getImagemById(Long id);
}
 