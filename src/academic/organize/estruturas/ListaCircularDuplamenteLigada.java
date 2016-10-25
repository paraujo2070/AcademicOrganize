package academic.organize.estruturas;

import javax.swing.JOptionPane;

public class ListaCircularDuplamenteLigada {

    private No primeiraRef;
    private No ultimaRef;
    private int totalDeElementos;

    public ListaCircularDuplamenteLigada() {
        setPrimeiraRef(null);
        setUltimaRef(null);
    }

    public void inserirNoFim(No novoNoSimples) {

        if (listaVazia()) {
            novoNo(novoNoSimples);
        } else {
            ultimaRef.setProx(novoNoSimples);
            novoNoSimples.setAnt(ultimaRef);
            ultimaRef = novoNoSimples;
        }
        encrementarTotalDeElementos();
    }

    public void inserirNoInicio(No novoNoSimples) {

        if (listaVazia()) {
            novoNo(novoNoSimples);
        } else {
            primeiraRef.setAnt(novoNoSimples);
            primeiraRef = novoNoSimples;
        }
        encrementarTotalDeElementos();
    }

    public void inserirEmQualquerPosicao(No novoNoSimples, int posicao) {

        int valor = novoNoSimples.getValor();

        if (listaVazia()) {
            novoNo(novoNoSimples);
        } else {
            int posicaoAnterior = posicao - 1;

            No anterior = noAtual(posicaoAnterior);
            No proxima = anterior.getProx();
            No nova = new No(anterior.getProx(), valor);
            nova.setAnt(anterior);
            anterior.setProx(nova);
            nova.setProx(proxima);
            proxima.setAnt(nova);

            encrementarTotalDeElementos();
        }
    }

    public void exibirPrimeiro() {

        if (listaVazia()) {
            JOptionPane.showMessageDialog(null, "Lista vazia!");
        } else {
            JOptionPane.showMessageDialog(null, primeiraRef.getValor());
        }
    }

    public void exibirUltimo() {

        if (listaVazia()) {
            JOptionPane.showMessageDialog(null, "Lista vazia!");
        } else {
            JOptionPane.showMessageDialog(null, ultimaRef.getValor());
        }
    }

    public void exibirTudo() {

        if (listaVazia()) {
            JOptionPane.showMessageDialog(null, "Lista vazia!");
        } else {

            No temp = primeiraRef;
            String valorParaImprimir = "";

            while (temp != null) {
                valorParaImprimir = valorParaImprimir + "\n" + temp.getValor();
                temp = temp.getProx();
            }
            JOptionPane.showMessageDialog(null, valorParaImprimir);
        }
    }

    public void buscar(int valor) {

        No temp = primeiraRef;
        No noEncontrado = null;

        while (temp != null) {

            if (temp.getValor() == valor) {
                noEncontrado = temp;
            }

            temp = temp.getProx();
        }

        if (noEncontrado.getValor() == valor) {
            JOptionPane.showMessageDialog(null, "Valor localizado:" + noEncontrado.getValor());
        } else {
            JOptionPane.showMessageDialog(null, "Não foi encontrado o elemento com a informação pedida!");
        }
    }

    public void removerNoInicio() {

        if (!verificarPosicao(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        primeiraRef = primeiraRef.getProx();
        decrementarTotalDeElementos();

        if (totalDeElementos == 0) {
            primeiraRef = ultimaRef = null;
        }
    }

    public void removerNoFim() {

        if (!verificarPosicao(totalDeElementos - 1)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        if (totalDeElementos == 1) {
            removerNoInicio();
        } else {

            No penultima = ultimaRef.getAnt();
            penultima.setProx(null);
            ultimaRef = penultima;

            decrementarTotalDeElementos();
        }

    }

    public void removerEmQualquerPosicao(int posicao) {

        if (!verificarPosicao(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        } else {

            No anterior = noAtual(posicao);
            No temp = anterior.getProx();
            No proxima = temp.getProx();

            anterior.setProx(proxima);
            proxima.setAnt(anterior);

            decrementarTotalDeElementos();
        }

    }

    private boolean listaVazia() {

        if (primeiraRef == null) {
            return true;
        } else {
            return false;
        }
    }

    private void encrementarTotalDeElementos() {
        totalDeElementos++;
    }

    private void decrementarTotalDeElementos() {
        totalDeElementos--;
    }

    private boolean verificarPosicao(int posicao) {
        return posicao >= 0 && posicao < totalDeElementos;
    }

    private No noAtual(int posicao) {

        if (!verificarPosicao(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        No temp = primeiraRef;

        for (int i = 0; i < posicao; i++) {
            temp = temp.getProx();
        }

        return temp;
    }

    private void novoNo(No novoNoSimples) {
        primeiraRef = ultimaRef = novoNoSimples;
    }

    public No getPrimeiraRef() {
        return primeiraRef;
    }

    public void setPrimeiraRef(No primeiraRef) {
        this.primeiraRef = primeiraRef;
    }

    public No getUltimaRef() {
        return ultimaRef;
    }

    public void setUltimaRef(No ultimaRef) {
        this.ultimaRef = ultimaRef;
    }
}
