public class Unidade {
//  Declaração de Atributos
    private int cd_unidade;
    private String ds_unidade;

  /*Atalho para criação dos gets e sets =  Code - Generate - Gatter and Setter
     Atalho para criação do Metodo Construtor = Code - Generate - Constructor*/
  
  /*Metodos Construtor que recebe o código da unidade e a descriçãop da unidade 
     como argumento e realiza a inserção através dos métodos sets*/
    public Unidade(int cd_unidade, String ds_unidade) {
//        this.cd_unidade = cd_unidade;- Método Automático criado através do atalho
//        this.ds_unidade = ds_unidade;- Método Automático criado através do atalho
        this.setCd_unidade(cd_unidade);
        this.setDs_unidade(ds_unidade);
    }

    /*Métodos construtor vazio, criado para permitir que a classe seja instanciada sem a passagem de argumentos */
    public Unidade() {
    }

  /*Método GET para permitir a inserção de valores do código da unidade */
    public int getCd_unidade() {
        return cd_unidade;
    }

  /*Método SET para permitir o acesso aos valores do código da unidade */
    public void setCd_unidade(int cd_unidade) {
        this.cd_unidade = cd_unidade;
    }

  /*Método GET para permitir a inserção de valores da Descrição da unidade */
    public String getDs_unidade() {
        return ds_unidade;
    }

 /*Método SET para permitir o acesso aos valores da descrição da unidade */
    public void setDs_unidade(String ds_unidade) {
        this.ds_unidade = ds_unidade;
    }
}
