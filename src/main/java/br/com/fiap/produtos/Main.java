package br.com.fiap.produtos;


import br.com.fiap.produtos.model.Categoria;
import br.com.fiap.produtos.model.Produto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Categoria categoria = new Categoria();

        categoria.setId(1l).setNome("Eletrônicos");

        Produto produto = new Produto();
        produto.setId(1l)
                .setNome("kindle")
                .setDescricao("e-reader")
                .setCategoria(categoria)
                .setDataDeCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(800));

        System.out.println("Categoria: " + categoria);
        System.out.println("Produto: " + produto);

    }
}