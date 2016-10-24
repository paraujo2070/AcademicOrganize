package academic.organize.controlador;

import academic.organize.entidade.Entidade;
import academic.organize.entidade.Secretario;
import academic.organizze.execoes.ExcecaoEntidadeNaoExistente;
import academic.organizze.execoes.ExcecaoNegocio;
import academic.organizze.execoes.ExcecaoRegistroExistente;

public interface IControladorSecretario {

    void cadastra(Secretario secretario) throws ExcecaoNegocio, ExcecaoRegistroExistente;

    void atualizar(Secretario secretario) throws ExcecaoNegocio, ExcecaoEntidadeNaoExistente;

    void remover(String id) throws ExcecaoEntidadeNaoExistente;

    Entidade consultar(String id) throws ExcecaoEntidadeNaoExistente;
}
