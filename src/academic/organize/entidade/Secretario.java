package academic.organize.entidade;

public class Secretario extends Funcionario {

    public Secretario(String matricula, String senha, String login, String nome, String sobrenome, String cpf, String identidade, String nascimento,
            String email, String estadoCivil, String sexo, String telefone, Endereco endereco) {
        super(matricula, senha, login, nome, sobrenome, cpf, identidade, nascimento, email, estadoCivil, sexo, telefone, endereco);
    }

}
