/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimples;

/**
 *
 * @author leona
 */
public class ListaSimples<T> {

    private Celula inicio, fim;
    private int tamanho;

    public Celula getInicio() {
        return inicio;
    }

    public void setInicio(Celula inicio) {
        this.inicio = inicio;
    }

    public Celula getFim() {
        return fim;
    }

    public void setFim(Celula fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    

    public ListaSimples() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public ListaSimples(T elemento){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        this.adicionaInicio(elemento);
    
    }

    public void adicionaInicio(T elemento) {
        Celula nova = new Celula(elemento);

        if (this.tamanho == 0)
        {
            this.inicio = this.fim = nova;
            this.tamanho++;
        }
        else
        {
            nova.setProximo(inicio);
            this.setInicio(nova);
            this.tamanho++;   

        }
    }
    
    public void adiciona(T elemento, int pos) {
        if(this.tamanho == 0){//Adição quando a lista for vazia
            this.adicionaInicio(elemento);
        }else if(pos > this.tamanho-1){
            System.out.println("Impossível adicionar na posição definida!");
        }
        else if(pos == 0){
            this.adicionaInicio(elemento);
        }else{
            Iterador<T> it = new Iterador<T>(this.inicio);
            int i = 0;
            while (it.hasNext() && i != pos)
            {
                System.out.println(it.getAtual().elemento);
                i++;
                it.next();
            }
            it.getAtual().setElemento(elemento);
            this.tamanho++;
            //System.out.println(it.getAtual().elemento);
     
        }
    }
    
    public void adicionaFim(T elemento){
        Celula nova = new Celula(elemento);

        if (this.tamanho == 0)
        {
            this.inicio = this.fim = nova;
            this.tamanho++;
        }
        else
        {   
            Iterador<T> it = new Iterador<T>(this.inicio);
            int i = 1;
            while (it.hasNext() && i != this.tamanho)
            {
                i++;
                it.next();
            }
            it.getAtual().setProximo(nova);
            this.tamanho++;

        }
    }
    
    public boolean existeDado(T elemento){
        boolean res;
        Iterador it = new Iterador(this.inicio);
        int i = 0;
        if(it.hasNext() && it.getAtual().getElemento().toString() != elemento){
            it.next();
            i++;
            res = false;
        }else{
            res = true;
        }
        return res;
    }

    public T recupera(int posicao) {
        
        if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");
            return null;
            
        } else if (posicao < 0 || posicao >= this.tamanho) {
            
            System.out.println("A Posição " + posicao + " é Inválida!");
            return null;
            
        } else {
            
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            
            return (T) it.getAtual().getElemento();
        }
    }
    
    public int tamanho(){
        Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                    it.next();
                    i++;
            }
        return i;
    }

    public void removeInicio() {
        
        if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            
        } else if (inicio == fim) {
            
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {
            
            inicio = inicio.getProximo();
            this.tamanho -= 1;
        }
    }
    
    public void removeFim(){
       if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            
        } else if (inicio == fim) {
            
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {
            this.fim.setElemento(this.recupera(tamanho-2));
            this.tamanho -= 1;
        } 
    }
    
    public void remove(int pos) {
        if(this.tamanho == 0){//Adição quando a lista for vazia
            System.out.println("A lista já está vazia!");
        }else if(this.recupera(pos) != null && pos == 0){//remoção no início de uma lista populada
            this.removeInicio();
        }else if(this.recupera(pos) != null && pos == (this.tamanho - 1)){//Remove o final da lista
            this.removeFim();
        }else{//Removendo de qualquer lugar
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i < pos) {
                    it.next();
                    i++;
                }else{
                    it.getAtual().setElemento(null);
                    this.tamanho -= 1;
                }    
            }
        }
    }
    
    public void listarLista(){
        System.out.println("Listando Fila:\n");
        if(this.tamanho == 0){
            System.out.println("A fila está vazia!");
        }else{
            Iterador<T> it = new Iterador<T>(this.inicio);
            int i = 0;
            while (it.hasNext())
            {
                System.out.println(it.getAtual().elemento);
                it.next();
            }                
        }
        System.out.println("\n");
    }
    
    public void limpa(){
        if(this.tamanho == 0){
            System.out.println("A lista já está vazia!");
        }else{
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                it.getAtual().setElemento(null);
                this.tamanho -= 1;
                it.next(); 
            }
            this.inicio = null;
            this.fim = null;
        }
    }

    @Override
    public String toString() {
        return "ListaSimples{" + "inicio=" + inicio + ", fim=" + fim + ", tamanho=" + tamanho + '}';
    }

}