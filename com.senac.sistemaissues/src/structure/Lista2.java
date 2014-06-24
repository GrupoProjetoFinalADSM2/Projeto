package structure;

import exception.ElementoInexistenteException;

public class Lista2{
    No primeiro,ultimo;
    int totalNos;

    public Lista2(){
        primeiro = ultimo = null;
        totalNos = 0;
    }
    //______________________________________________________
    public int getTotalNos(){
        return totalNos;
    }
    //______________________________________________________
    public boolean checkIfListaVazia(){
        if (getTotalNos() == 0){
            return true;
       }
       return false;
    }
    //______________________________________________________
    public void inserirNoInicio(No n) {
        if ( checkIfListaVazia() ){
            primeiro = ultimo = n;
        }
        else{
            n.prox = primeiro;
            primeiro = n;
        }
        totalNos++;
    }
    //______________________________________________________
    public void inserirNoFim(No n){
        // caso não existam nós inseridos,
        // insere o primeiro nó (n) na lista
        if ( checkIfListaVazia() ){
            primeiro = ultimo = n;
        }
        else{
            ultimo.prox = n;
            ultimo = n;
       }
       totalNos++;
    }
    //______________________________________________________
    public void excluirNo(No n){
        No noAtual;
        No noAnterior;
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
    //______________________________________________________
    public void exibirLista(){
    No temp = primeiro;
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
	}
















