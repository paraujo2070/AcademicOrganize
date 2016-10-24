package academic.organize.controlador;

import academic.organize.entidade.Entidade;
import academic.organize.entidade.Professor;
import academic.organizze.execoes.ExcecaoEntidadeNaoExistente;
import academic.organizze.execoes.ExcecaoNegocio;
import academic.organizze.execoes.ExcecaoRegistroExistente;

public interface IControladorProfessor {

    void cadastra(Professor professor) throws ExcecaoNegocio, ExcecaoRegistroExistente;

    void atualizar(Professor professor) throws ExcecaoNegocio, ExcecaoEntidadeNaoExistente;

    void remover(String id) throws ExcecaoEntidadeNaoExistente;

    Entidade consultar(String id) throws ExcecaoEntidadeNaoExistente;
}
