package referenciando_metodos_estaticos;

public class ServicoInativacaoProduto {

    public static void processar(Produto produto) {
        System.out.println("Inativando " + produto.getNome());
        produto.inativar();
    }

}