package referenciando_construtores;

public class ServicoInativacaoProduto {

    public static void processar(Produto produto) {
        System.out.println("Inativando " + produto.getNome());
        produto.inativar();
    }

}