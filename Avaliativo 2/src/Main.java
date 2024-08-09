import Patterns.ProdutoFacade;

public class Main {
    public static void main(String[] args) {
        ProdutoFacade facade = new ProdutoFacade("Notebook", 4500.00);
        facade.exibirProduto();
        facade.atualizarProduto("Smartphone", 800.00);
    }
}
