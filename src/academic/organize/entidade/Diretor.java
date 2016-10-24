package academic.organize.entidade;

import java.io.Serializable;

public class Diretor extends Funcionario implements Serializable {

    public Diretor(String matricula, String senha, String login) {
        super(matricula, senha, login);
    }

}
