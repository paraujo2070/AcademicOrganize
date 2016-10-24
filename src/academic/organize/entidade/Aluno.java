package academic.organize.entidade;

import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable {

    private Professor professor;
    private Notas notas;
    private Faltas faltas;
    private String matricula;
    private String login;
    private String senha;

    public Aluno() {
    }

    public Aluno(Professor professor, Notas notas, Faltas faltas, String matricula) {
        this.professor = professor;
        this.notas = notas;
        this.faltas = faltas;
        this.matricula = matricula;
    }

    public Aluno(Professor professor, Notas notas, Faltas faltas, String matricula, String login, String senha, String nome, String sobrenome, String cpf, String identidade, String nascimento, String email, String estadoCivil, String sexo, String telefone, Endereco endereco) {
        super(nome, sobrenome, cpf, identidade, nascimento, email, estadoCivil, sexo, telefone, endereco);
        this.professor = professor;
        this.notas = notas;
        this.faltas = faltas;
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public Faltas getFaltas() {
        return faltas;
    }

    public void setFaltas(Faltas faltas) {
        this.faltas = faltas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getId() {
        return matricula;
    }

}
