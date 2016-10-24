package academic.organize.fabrica;

import academic.organize.controlador.ControladorAluno;
import academic.organize.controlador.ControladorDiretor;
import academic.organize.controlador.ControladorProfessor;
import academic.organize.controlador.ControladorSecretario;
import academic.organize.controlador.IControladorAluno;
import academic.organize.controlador.IControladorDiretor;
import academic.organize.controlador.IControladorProfessor;
import academic.organize.controlador.IControladorSecretario;

public class FabricaControlador {

    public static IControladorDiretor getControladorDiretor() {
        return new ControladorDiretor();
    }

    public static IControladorAluno getCOntroladorAluno() {
        return new ControladorAluno();
    }

    public static IControladorProfessor getControladorProfesssor() {
        return new ControladorProfessor();
    }

    public static IControladorSecretario getControladorScretario() {
        return new ControladorSecretario();
    }
}
