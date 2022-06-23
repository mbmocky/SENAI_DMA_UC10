public class Principal {
    public static void main(String[] args) {
        //DAO_Produtos obj_produtos = new DAO_Produtos();

        //CONSULTAR PRODUTOS
        //obj_produtos.consultar();

        //INSERIR PRODUTOS
        //Produto novoProduto = new Produto(7, "Miojo",5.00,10.0,1);
        //obj_produtos.inserir(novoProduto);

        //ALTERAR PRODUTO
        //Produto produtoAlterado = new Produto(7,"Miojo Alterado",2.50,100.00,2);
        //obj_produtos.alterar(produtoAlterado);

        //EXCLUIR PRODUTO
        //obj_produtos.excluir(4);

        DAO_Unidades obj_unidades = new DAO_Unidades();

        //CONSULTAR UNIDADES
        //obj_unidades.consultar();

        //INSERIR UNIDADE
        //Unidade novaUnidade = new Unidade(7,"metade");
        //obj_unidades.inserir(novaUnidade);

        //ALTERAR UNIDADE
        //Unidade unidadeAlterada = new Unidade(7,"centena");
        //obj_unidades.alterar(unidadeAlterada);

        //EXCLUIR UNIDADE
        obj_unidades.excluir(7);
    }
}
