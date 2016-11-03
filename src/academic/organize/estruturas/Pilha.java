package academic.organize.estruturas;

public class Pilha {

    private int tamanho;
    private int topo;
    private Object vetor[];
    private int total;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.topo = -1;
        this.vetor = new Object[tamanho];
        this.total = 0;
    }

    public void empilhar(Object objetoAtual) {

        if (pilhaCheia()) {
            throw new StackOverflowError("Pilha cheia!");
        } else {
            vetor[topo + 1] = objetoAtual;
            topo++;
            total++;
        }
    }

    public Object desempilhar() {

        if (pilhaVazia()) {
            throw new IndexOutOfBoundsException("Pilha vazia!");
        } else {
            Object objetoRetirado = vetor[topo];
            vetor[topo] = null;
            topo--;
            total--;

            return objetoRetirado;
        }
    }

    public void exibirPilha() {

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println((i + 1) + "º elemento: " + vetor[i].toString());
            }
        }
    }

    public Object topo() {
        return vetor[topo];
    }

    public int tamanho() {

        return total;
    }

    private boolean pilhaVazia() {

        if (total > 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean pilhaCheia() {

        if (total != tamanho) {
            return false;
        } else {
            return true;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public Object[] getVetor() {
        return vetor;
    }

    public void setVetor(Object[] vetor) {
        this.vetor = vetor;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
