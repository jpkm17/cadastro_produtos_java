package br.com.fiap.produtos;


import br.com.fiap.produtos.model.Categoria;
import br.com.fiap.produtos.model.Produto;
import br.com.fiap.produtos.repository.CategoriaCollectionRepository;
import br.com.fiap.produtos.repository.ProdutoCollectionRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("Kindle")
                .setDescricao("e-reader")
                .setCategoria(CategoriaCollectionRepository.findByNome("eletrônicos").getFirst())
                .setDataDeCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(800));

        Produto produto1 = ProdutoCollectionRepository.save(produto);
        System.out.println("ID: " + produto1.getId() + ", Nome do produto: " + produto1.getNome());
    }
}