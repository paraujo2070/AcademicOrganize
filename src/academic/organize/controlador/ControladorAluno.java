package academic.organize.controlador;

import academic.organize.dao.IDao;
import academic.organize.entidade.Aluno;
import academic.organize.entidade.Entidade;
import academic.organize.fabrica.FabricaDao;
import academic.organizze.execoes.ExcecaoEntidadeNaoExistente;
import academic.organizze.execoes.ExcecaoNegocio;
import academic.organizze.execoes.ExcecaoRegistroExistente;

public class ControladorAluno implements IControladorAluno {

    @Override
    public void cadastra(Aluno aluno) throws ExcecaoNegocio, ExcecaoRegistroExistente {
        IDao<Aluno> daoAluno = FabricaDao.getDao(Aluno.class);

        if (daoAluno.exists(aluno)) {
            throw new ExcecaoRegistroExistente();
        }
        daoAluno.criar(aluno);
    }

    @Override
    public void atualizar(Aluno aluno) throws ExcecaoNegocio, ExcecaoEntidadeNaoExistente {
        IDao<Aluno> daoAluno = FabricaDao.getDao(Aluno.class);

        if (!daoAluno.exists(aluno)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoAluno.atualizar(aluno);
    }

    @Override
    public void remover(String id) throws ExcecaoEntidadeNaoExistente {
        IDao<Aluno> daoAluno = FabricaDao.getDao(Aluno.class);

        if (!daoAluno.exists(id)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoAluno.remover(id);
    }

    @Override
    public Entidade consultar(String id) throws ExcecaoEntidadeNaoExistente {
        IDao<Aluno> daoAluno = FabricaDao.getDao(Aluno.class);
        try {
            if (!daoAluno.exists(id)) {
                throw new ExcecaoEntidadeNaoExistente();
            }

            return daoAluno.consultar(id);
        } catch (ExcecaoEntidadeNaoExistente ex) {
            throw new ExcecaoEntidadeNaoExistente();
        }

    }

}
