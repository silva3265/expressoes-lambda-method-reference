package referenciando_metodos_instancia_particular;

public class ServicoInativacaoProduto {

    public void processar(Produto produto) {
        System.out.println("Inativando " + produto.getNome());
        produto.inativar();
    }

}