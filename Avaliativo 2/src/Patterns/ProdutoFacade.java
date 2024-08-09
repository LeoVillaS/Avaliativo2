package Patterns;

import Controller.ProdutoController;
import Model.Produto;
import View.ProdutoView;

public class ProdutoFacade {
    private ProdutoController controller;

    public ProdutoFacade(String nome, double preco) {
        Produto model = new Produto(nome, preco);
        ProdutoView view = new ProdutoView();
        controller = new ProdutoController(model, view);
    }

    public void atualizarProduto(String nome, double preco) {
        controller.setNomeProduto(nome);
        controller.setPrecoProduto(preco);
        controller.atualizarView();
    }

    public void exibirProduto() {
        controller.atualizarView();
    }
}
