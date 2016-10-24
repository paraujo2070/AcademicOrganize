package academic.organize.controlador;

import academic.organize.dao.IDao;
import academic.organize.entidade.Entidade;
import academic.organize.entidade.Secretario;
import academic.organize.fabrica.FabricaDao;
import academic.organizze.execoes.ExcecaoEntidadeNaoExistente;
import academic.organizze.execoes.ExcecaoNegocio;
import academic.organizze.execoes.ExcecaoRegistroExistente;

public class ControladorSecretario implements IControladorSecretario {

    @Override
    public void cadastra(Secretario secretario) throws ExcecaoNegocio, ExcecaoRegistroExistente {
        IDao<Secretario> daoSecretario = FabricaDao.getDao(Secretario.class);

        if (daoSecretario.exists(secretario)) {
            throw new ExcecaoRegistroExistente();
        }
        daoSecretario.criar(secretario);
    }

    @Override
    public void atualizar(Secretario secretario) throws ExcecaoNegocio, ExcecaoEntidadeNaoExistente {
        IDao<Secretario> daoSecretario = FabricaDao.getDao(Secretario.class);

        if (!daoSecretario.exists(secretario)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoSecretario.atualizar(secretario);

    }

    @Override
    public void remover(String id) throws ExcecaoEntidadeNaoExistente {
        IDao<Secretario> daoSecretario = FabricaDao.getDao(Secretario.class);

        if (!daoSecretario.exists(id)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoSecretario.remover(id);
    }

    @Override
    public Entidade consultar(String id) throws ExcecaoEntidadeNaoExistente {
        IDao<Secretario> daoSecretario = FabricaDao.getDao(Secretario.class);

        try {
            if (!daoSecretario.exists(id)) {
                throw new ExcecaoEntidadeNaoExistente();
            }

            return daoSecretario.consultar(id);
        } catch (ExcecaoEntidadeNaoExistente ex) {
            throw new ExcecaoEntidadeNaoExistente();
        }

    }

}
