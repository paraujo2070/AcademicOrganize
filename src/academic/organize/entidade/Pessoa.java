package academic.organize.entidade;

import java.io.Serializable;

public abstract class Pessoa extends Entidade implements Serializable {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String identidade;
    private String nascimento;
    private String email;
    private String estadoCivil;
    private String sexo;
    private String telefone;
    private Endereco endereco;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, String sobrenome, String cpf, String identidade, String nascimento,
            String email, String estadoCivil, String sexo, String telefone, Endereco endereco) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.nascimento = nascimento;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public abstract String getId();
}
