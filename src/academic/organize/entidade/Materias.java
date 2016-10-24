package academic.organize.entidade;

import java.io.Serializable;

public class Materias extends Entidade implements Serializable {

    private Questoes questoes;

    public Questoes getQuestoes() {
        return questoes;
    }

    public void setQuestoes(Questoes questoes) {
        this.questoes = questoes;
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
