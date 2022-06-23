public class Unidade {
//  Declaração de Atributos
    private int cd_unidade;
    private String ds_unidade;

    // Atalho para criação dos gets e sets =  Code - Generate - Gatter and Setter
    // Metodo Construtor = Code - Generate - Constructor

    public Unidade(int cd_unidade, String ds_unidade) {
//        this.cd_unidade = cd_unidade;
//        this.ds_unidade = ds_unidade;
        this.setCd_unidade(cd_unidade);
        this.setDs_unidade(ds_unidade);
    }

    public Unidade() {
    }

    public int getCd_unidade() {
        return cd_unidade;
    }

    public void setCd_unidade(int cd_unidade) {
        this.cd_unidade = cd_unidade;
    }

    public String getDs_unidade() {
        return ds_unidade;
    }

    public void setDs_unidade(String ds_unidade) {
        this.ds_unidade = ds_unidade;
    }
}
