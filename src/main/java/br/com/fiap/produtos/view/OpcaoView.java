package br.com.fiap.produtos.view;

import javax.swing.*;

public class OpcaoView {

    public static Opcao select(){

        Opcao ret = (Opcao) JOptionPane.showInputDialog(
                null, // componente pai
                "Selecionar uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, //icone
                Opcao.values(), //Numero de opção
                Opcao.CADASTRAR_PRODUTO);

        return ret != null ? ret : Opcao.ENCERRAR_SISTEMA;
    }

}
