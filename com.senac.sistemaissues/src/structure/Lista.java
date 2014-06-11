package structure;

public class Lista<T> {

	No<T> primeiro,ultimo;
	int totalNos;

	public Lista (){
		primeiro = ultimo = null;
		totalNos = 0;
	}

	public int getTotalNos(){
		return totalNos;
	}


	public boolean checkIfListaVazia(){
		if (getTotalNos() == 0){
			return true;
		}
		return false;
	}

	public void inserirNoInicio(No<T> n) {
		if ( checkIfListaVazia() ){
			primeiro = ultimo = n;
		}
		else{
			n.prox = primeiro;
			primeiro = n;
		}
		totalNos++;
	}

	public void inserirNoFim(No<T> n){
		// caso nao existam Nos inseridos,
		// insere o primeiro No (n) na lista
		if ( checkIfListaVazia() ){
			primeiro = ultimo = n;
		}
		else{
			ultimo.prox = n;
			ultimo = n;
		}
		totalNos++;
	}

	public void excluirNo(No<T> n){
		No<T> noAtual;
		No<T> noAnterior;
		noAtual = noAnterior = primeiro;
		int contador = 1;

		if (checkIfListaVazia() == false){
			while (contador <= getTotalNos() &&
					noAtual.valor != n.valor){
				noAnterior = noAtual;
				noAtual = noAtual.prox;
				contador++;
			} 

			if(noAtual.valor == n.valor){
				if ( getTotalNos() == 1){
					primeiro = ultimo = null;
				}
				else{
					if (noAtual == primeiro){
						primeiro = noAtual.prox;
					}
					else{
						noAnterior.prox = noAtual.prox;
					}
				}
				totalNos--;
			}
		}
	}

	public void exibirLista(){
		No<T> temp = primeiro;
		String valores = "";
		int contador = 1;
		if ( checkIfListaVazia() == false ){
			while (contador <= getTotalNos()){
				valores += temp.valor+"-";
				temp = temp.prox;
				contador++;
			}
		}
		System.out.println(valores);
	}

	public No<T> procuraLista() {
		No<T> temp = primeiro;
		No<T> atual;
		int contador = 0;
		if (checkIfListaVazia() == false)  {
			while (contador <= getTotalNos()) {
				contador++;
				atual = 
				return atual;
			}
		} else {
			return temp;
		}

	}

}



}


