package academic.organize.controlador;

import academic.organize.entidade.Diretor;
import academic.organize.entidade.Entidade;
import academic.organizze.execoes.ExcecaoEntidadeNaoExistente;
import academic.organizze.execoes.ExcecaoNegocio;
import academic.organizze.execoes.ExcecaoRegistroExistente;

public interface IControladorDiretor {

    void cadastra(Diretor diretor) throws ExcecaoNegocio, ExcecaoRegistroExistente;

    void atualizar(Diretor diretor) throws ExcecaoNegocio, ExcecaoEntidadeNaoExistente;

    void remover(String id) throws ExcecaoEntidadeNaoExistente;

    Entidade consultar(String id) throws ExcecaoEntidadeNaoExistente;
}
