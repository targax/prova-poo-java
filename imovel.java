public class imovel {
    private String endereco;
    private int metragem;
    private int valor;
    private proprietario proprietario;
    private boolean Novo;

    public boolean isNovo() {
        return Novo;
    }
    public proprietario getProprietario() {
        return proprietario;
    }
    public void setProprietario(proprietario proprietario) {
        this.proprietario = proprietario;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getMetragem() {
        return metragem;
    }
    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int calculaMetro(int valor, int metragem){
        return valor/metragem;
    }

    public imovel(String endereco, int metragem, int valor, proprietario proprietario, boolean Novo){
        this.endereco = endereco;
        this.metragem = metragem;
        this.valor = valor;
        this.proprietario = proprietario;
        this.Novo = Novo;
    }
}
