package academic.organize.estruturas;

public class No {

    private int valor;
    private No prox;
    private No ant;

    public No(int valor) {
        this.setValor(valor);
        setProx(null);
    }

    public No(No prox, int valor) {
        this.setValor(valor);
        setProx(prox);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }
}
