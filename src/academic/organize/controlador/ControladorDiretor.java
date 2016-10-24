package academic.organize.controlador;

import academic.organize.dao.IDao;
import academic.organize.entidade.Diretor;
import academic.organize.entidade.Entidade;
import academic.organize.fabrica.FabricaDao;
import academic.organizze.execoes.ExcecaoEntidadeNaoExistente;
import academic.organizze.execoes.ExcecaoNegocio;
import academic.organizze.execoes.ExcecaoRegistroExistente;

public class ControladorDiretor implements IControladorDiretor {

    @Override
    public void cadastra(Diretor diretor) throws ExcecaoNegocio, ExcecaoRegistroExistente {
        IDao<Diretor> daoDiretor = FabricaDao.getDao(Diretor.class);

        if (daoDiretor.exists(diretor)) {
            throw new ExcecaoRegistroExistente();
        }
        daoDiretor.criar(diretor);
    }

    @Override
    public void atualizar(Diretor diretor) throws ExcecaoNegocio, ExcecaoEntidadeNaoExistente {
        IDao<Diretor> daoDiretor = FabricaDao.getDao(Diretor.class);

        if (!daoDiretor.exists(diretor)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoDiretor.atualizar(diretor);
    }

    @Override
    public void remover(String id) throws ExcecaoEntidadeNaoExistente {
        IDao<Diretor> daoDiretor = FabricaDao.getDao(Diretor.class);

        if (!daoDiretor.exists(id)) {
            throw new ExcecaoEntidadeNaoExistente();
        }
        daoDiretor.remover(id);
    }

    @Override
    public Entidade consultar(String id) throws ExcecaoEntidadeNaoExistente {
        IDao<Diretor> daoDiretor = FabricaDao.getDao(Diretor.class);

        try {
            if (!daoDiretor.exists(id)) {
                throw new ExcecaoEntidadeNaoExistente();
            }

            return daoDiretor.consultar(id);
        } catch (ExcecaoEntidadeNaoExistente ex) {
            throw new ExcecaoEntidadeNaoExistente();
        }
    }

}
