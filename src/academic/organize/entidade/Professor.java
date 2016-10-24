package academic.organize.entidade;

public class Professor extends Pessoa {

    private Aluno alunos;
    private Disciplinas disciplinas;
    private String matricula;

    public Professor(Aluno alunos, Disciplinas disciplinas, String matricula) {
        this.alunos = alunos;
        this.disciplinas = disciplinas;
        this.matricula = matricula;
    }

    public Professor(Aluno alunos, Disciplinas disciplinas, String matricula, String nome, String sobrenome, String cpf, 
            String identidade, String nascimento,String email, String estadoCivil, String sexo, String telefone, Endereco endereco) {
        super(nome, sobrenome, cpf, identidade, nascimento, email, estadoCivil, sexo, telefone, endereco);
        this.alunos = alunos;
        this.disciplinas = disciplinas;
        this.matricula = matricula;
    }

    public Aluno getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }

    public Disciplinas getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplinas disciplinas) {
        this.disciplinas = disciplinas;
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
