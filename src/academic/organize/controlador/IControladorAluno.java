package academic.organize.controlador;

import academic.organize.entidade.Aluno;
import academic.organize.entidade.Entidade;
import academic.organizze.execoes.ExcecaoEntidadeNaoExistente;
import academic.organizze.execoes.ExcecaoNegocio;
import academic.organizze.execoes.ExcecaoRegistroExistente;

public interface IControladorAluno {

    void cadastra(Aluno aluno) throws ExcecaoNegocio, ExcecaoRegistroExistente;

    void atualizar(Aluno aluno) throws ExcecaoNegocio, ExcecaoEntidadeNaoExistente;

    void remover(String id) throws ExcecaoEntidadeNaoExistente;

    Entidade consultar(String id) throws ExcecaoEntidadeNaoExistente;
}
