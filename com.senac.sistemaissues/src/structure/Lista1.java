package structure;

public class Lista1 {
//	private Celula primeira;
//	private Celula ultima;
//	private int totalDeElementos;
//	private int totalDeAlunos;
//
//	//______________________________________________________ 
//	public void adicionaNoComeco(Object elemento) {
//    Celula nova = new Celula(this.primeira, elemento);
//    this.primeira = nova;
//
//    if(this.totalDeElementos == 0){
//      // caso especial da lista vazia
//      this.ultima = this.primeira;
//    }
//    this.totalDeElementos++;
//  }
//  	//______________________________________________________
//  	//Adiciona no fim da lista
//  	public void adicionaNoFim(Object elemento) {
//	    if (this.totalDeElementos == 0) {
//	      this.adicionaNoComeco(elemento);
//	    } else {
//	      Celula nova = new Celula(elemento);
//	      this.ultima.setProxima(nova);
//	      this.ultima = nova;
//	      this.totalDeElementos++;
//	    }
//	  }
//  	//______________________________________________________
//  	//percorrendo a lista
//  	public String toString() {
//
//	  // Verificando se a Lista está vazia
//	  if(this.totalDeElementos == 0){
//	    return "[]";
//	  }
//
//	  StringBuilder builder = new StringBuilder("[");
//	  Celula atual = primeira;
//
//	  // Percorrendo até o penúltimo elemento.
//	  for (int i = 0; i < this.totalDeAlunos - 1; i++) {
//	    builder.append(atual.getElemento());
//	    builder.append(", ");
//	    atual = atual.getProxima();
//	  }
//
//	  // último elemento
//	  builder.append(atual.getElemento());
//	  builder.append("]");
//
//	  return builder.toString();
//	}
//  	//______________________________________________________
//  	//Adiciona em qualquer posição da lista
//  	public boolean posicaoOcupada(int posicao){
//	  return posicao >= 0 && posicao < this.totalDeElementos;
//	}
//  	//______________________________________________________
//	private Celula pegaCelula(int posicao) {
//	  if(!this.posicaoOcupada(posicao)){
//	    throw new IllegalArgumentException("Posição não existe");
//	  }
//
//	  Celula atual = primeira;
//	  for (int i = 0; i < posicao; i++) {
//	    atual = atual.getProxima();
//	  }
//	  return atual;
//	}
//	//______________________________________________________
//	//Remove do começo
//	public void removeDoComeco() {
//		  if (!this.posicaoOcupada(0)) {
//		    throw new IllegalArgumentException("Posição não existe");
//		  }
//
//		  this.primeira = this.primeira.getProxima();
//		  this.totalDeElementos--;
//
//		  if (this.totalDeElementos == 0) {
//		    this.ultima = null;
//		  }
//		}
//	//______________________________________________________
//	//Remove do fim
//	public void removeDoFim() {
//		  if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
//		    throw new IllegalArgumentException("Posição não existe");
//		  }
//		  if (this.totalDeElementos == 1) {
//		    this.removeDoComeco();
//		  } else {
//		    Celula penultima = this.ultima.getAnterior();
//		    penultima.setProxima(null);
//		    this.ultima = penultima;
//		    this.totalDeElementos--;
//		  }
//		}
//	//______________________________________________________
//	//Remove de qualquer posição
//	public void remove(int posicao) {
//		  if (!this.posicaoOcupada(posicao)) {
//		    throw new IllegalArgumentException("Posição não existe");
//		  }
//
//		  if (posicao == 0) {
//		    this.removeDoComeco();
//		  } else if (posicao == this.totalDeElementos - 1) {
//		    this.removeDoFim();
//		  } else {
//		    Celula anterior = this.pegaCelula(posicao - 1);
//		    Celula atual = anterior.getProxima();
//		    Celula proxima = atual.getProxima();
//
//		    anterior.setProxima(proxima);
//		    proxima.setAnterior(anterior);
//
//		    this.totalDeElementos--;
//		  }
//		}
//	//______________________________________________________
//	//Verificando se um elemento esta na lista
//	public boolean contem(Object elemento) {
//		  Celula atual = this.primeira;
//
//		  while (atual != null) {
//		    if (atual.getElemento().equals(elemento)) {
//		      return true;
//		    }
//		    atual = atual.getProxima();
//		  }
//		  return false;
//		}
//	//______________________________________________________
//	//Adicionando no interior da lista
//	public void adiciona(int posicao, Object elemento) {
//		  if(posicao == 0){ // No começo.
//		    this.adicionaNoComeco(elemento);
//		  } else if(posicao == this.totalDeElementos){ // No fim.
//		    this.adicionaNoFim(elemento);
//		  } else {
//		    Celula anterior = this.pegaCelula(posicao - 1);
//		    Celula nova = new Celula(anterior.getProxima(), elemento);
//		    anterior.setProxima(nova);
//		    this.totalDeElementos++;
//		  }
//		}
}