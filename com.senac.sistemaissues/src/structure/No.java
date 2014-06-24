package structure;

public class No<T> {

	
	T valor;
	No prox;

	public No(T valor){
		this.valor = valor;
		prox = null;
	}

	public No getProx () {
		return prox;
	}

	public void setProx (No proxValor) {
		prox = proxValor;
	}

	public T getValor() {
		return valor;
	}



}
