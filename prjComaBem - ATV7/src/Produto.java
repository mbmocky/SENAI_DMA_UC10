public class Produto {
    // Declaração de Atributos
    private int cd_produto;
    private String ds_produto;
    private double vl_produto;
    private double qt_produto;
    private int cd_unidade;

    public int getCd_produto() {
        return cd_produto;
    }

    // Atalho para criação dos gets e sets =  Code - Generate - Gatter and Setter
    // Metodo Construtor = Code - Generate - Constructor

  /*Metodos Construtor que recebe o código do produto, a descriçãop do produto, o valor do produto, 
     a quantidade de produtos e o codigo da unidade de medida que o produto é armazenado e realiza a inserção através dos métodos sets*/
    public Produto(int cd_produto, String ds_produto, double vl_produto, double qt_produto, int cd_unidade) {
//        this.cd_produto = cd_produto; - Método Automático criado através do atalho
//        this.ds_produto = ds_produto;- Método Automático criado através do atalho
//        this.vl_produto = vl_produto;- Método Automático criado através do atalho
//        this.qt_produto = qt_produto;- Método Automático criado através do atalho
//        this.cd_unidade = cd_unidade;- Método Automático criado através do atalho

        this.setCd_produto(cd_produto);
        this.setDs_produto(ds_produto);
        this.setVl_produto(vl_produto);
        this.setQt_produto(qt_produto);
        this.setCd_unidade(cd_unidade);
    }

  /*Métodos construtor vazio, criado para permitir que a classe seja instanciada sem a passagem de argumentos */
    public Produto() {
    }

  /*Método SET para a leitura de valores do código do produto*/
    public void setCd_produto(int cd_produto) {
        this.cd_produto = cd_produto;
    }

/*Método GET para permitir a inserção de valores na descrição do produto*/
    public String getDs_produto() {
        return ds_produto;
    }

  /*Método SET para permitir a leitura de valores na descrição do produto*/
    public void setDs_produto(String ds_produto) {
        this.ds_produto = ds_produto;
    }

/*Método GET para permitir a inserção de valores no valor do produto*/
    public double getVl_produto() {
        return vl_produto;
    }

/*Método SET para permitir a leitura de valores no valor do produto*/
    public void setVl_produto(double vl_produto) {
        this.vl_produto = vl_produto;
    }

/*Método GET para permitir a inserção de valores na quantidade de produtos*/
    public double getQt_produto() {
        return qt_produto;
    }

/*Método SET para permitir a leitura de valores na quantidade de produtos*/
    public void setQt_produto(double qt_produto) {
        this.qt_produto = qt_produto;
    }

/*Método GET para permitir a inserção de valores de qual código da unidade que o produto é armazenado*/
    public int getCd_unidade() {
        return cd_unidade;
    }

/*Método SET para permitir a leitura de valores de qual código da unidade que o produto é armazenado*/
    public void setCd_unidade(int cd_unidade) {
        this.cd_unidade = cd_unidade;
    }
}
