package academic.organize.controlador;

import academic.organize.dao.IDao;
import academic.organize.entidade.Entidade;
import academic.organize.entidade.Professor;
import academic.organize.fabrica.FabricaDao;
import academic.organizze.execoes.ExcecaoEntidadeNaoExistente;
import academic.organizze.execoes.ExcecaoNegocio;
import academic.organizze.execoes.ExcecaoRegistroExistente;

public class ControladorProfessor implements IControladorProfessor {

    @Override
    public void cadastra(Professor professor) throws ExcecaoNegocio, ExcecaoRegistroExistente {
        IDao<Professor> daoProfessor = FabricaDao.getDao(Professor.class);

        if (daoProfessor.exists(professor)) {
            throw new ExcecaoRegistroExistente();
        }
        daoProfessor.criar(professor);

    }

    @Override
    public void atualizar(Professor professor) throws ExcecaoNegocio, ExcecaoEntidadeNaoExistente {
        IDao<Professor> daoProfessor = FabricaDao.getDao(Professor.class);

        if (!daoProfessor.exists(professor)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoProfessor.atualizar(professor);
    }

    @Override
    public void remover(String id) throws ExcecaoEntidadeNaoExistente {
        IDao<Professor> daoProfessor = FabricaDao.getDao(Professor.class);

        if (!daoProfessor.exists(id)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoProfessor.remover(id);
    }

    @Override
    public Entidade consultar(String id) throws ExcecaoEntidadeNaoExistente {
        IDao<Professor> daoProfessor = FabricaDao.getDao(Professor.class);

        try {
            if (!daoProfessor.exists(id)) {
                throw new ExcecaoEntidadeNaoExistente();
            }

            return daoProfessor.consultar(id);
        } catch (ExcecaoEntidadeNaoExistente ex) {
            throw new ExcecaoEntidadeNaoExistente();
        }
    }

}
