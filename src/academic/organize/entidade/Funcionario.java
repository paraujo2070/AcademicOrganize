package academic.organize.entidade;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {

    private String matricula;
    private String senha;
    private String login;

    public Funcionario(String matricula, String senha, String login) {
        this.matricula = matricula;
        this.senha = senha;
        this.login = login;
    }

    public Funcionario(String matricula, String senha, String login, String nome, String sobrenome, String cpf, String identidade,
            String nascimento, String email, String estadoCivil, String sexo, String telefone, Endereco endereco) {
        super(nome, sobrenome, cpf, identidade, nascimento, email, estadoCivil, sexo, telefone, endereco);
        this.matricula = matricula;
        this.senha = senha;
        this.login = login;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getId() {
        return matricula;
    }

}
