package academic.organize.estruturas;

public class Fila {
    private int tamanho;
	private int inicio;
	private int fim;
	private int total;
	private Object vetor[];

	public Fila(int tamanho) {
		this.inicio = this.fim = this.total = 0;
		this.tamanho = tamanho;
		this.vetor = new Object[tamanho];
	}

	public void enfilheirar(Object objetoAtual) {

		if (filaCheia()) {
			throw new StackOverflowError("Fila cheia!");
		} else {
			vetor[fim] = objetoAtual;
			fim++;
			total++;
		}
	}

	public Object desenfilheirar() {

		if (filaVazia()) {
			throw new IndexOutOfBoundsException("Fila vazia!");
		} else {
			Object objetoRetirado = vetor[inicio];
			vetor[inicio] = null;

			return objetoRetirado;
		}
	}

	public void exibirFila() {

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(vetor[i].toString());
			}
		}
	}

	private boolean filaVazia() {

		if (total > 0) {
			return false;
		} else {
			return true;
		}
	}

	private boolean filaCheia() {

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
		return inicio;
	}

	public void setTopo(int topo) {
		this.inicio = topo;
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

	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

}
