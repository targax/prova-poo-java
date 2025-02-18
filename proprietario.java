public class proprietario {
    private int cpf;
    private String nome;
    private int telefone;

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public proprietario(int cpf, String nome, int telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }
}
