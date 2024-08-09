package Controller;

import Model.Produto;
import View.ProdutoView;

public class ProdutoController {
    private Produto Model;
    private ProdutoView View;

    public ProdutoController(Produto Model, ProdutoView View) {
        this.Model = Model;
        this.View = View;
    }

    public void setNomeProduto(String nome) {
        Model.setNome(nome);
    }

    public String getNomeProduto() {
        return Model.getNome();
    }

    public void setPrecoProduto(double preco) {
        Model.setPreco(preco);
    }

    public double getPrecoProduto() {
        return Model.getPreco();
    }

    public void atualizarView() {
        View.imprimirDetalhesProduto(Model.getNome(), Model.getPreco());
    }
}
