package academic.organize.dao;

import academic.organize.entidade.Entidade;
import academic.organizze.execoes.ExcecaoEntidadeNaoExistente;
import academic.organizze.execoes.ExcecaoNegocio;
import java.util.ArrayList;

public interface IDao<T extends Entidade> {
 public void criar(T entidade) throws ExcecaoNegocio;

    public void atualizar(T entidade) throws ExcecaoEntidadeNaoExistente;

    public void remover(String id) throws ExcecaoEntidadeNaoExistente;

    public T consultar(String id) throws ExcecaoNegocio;

    public boolean exists(String id);

    public boolean exists(T entidade);

    ArrayList<T> listar() throws ExcecaoEntidadeNaoExistente, ClassNotFoundException, ExcecaoNegocio;


}
