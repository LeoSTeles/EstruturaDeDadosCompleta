/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deque;

/**
 *
 * @author leona
 */
public class Deque<T> { 
    private Celula Primeira, Ultima;
    private int TotalDeElementos;

    public Celula getPrimeira() {
        return Primeira;
    }

    public void setPrimeira(Celula Primeira) {
        this.Primeira = Primeira;
    }

    public Celula getUltima() {
        return Ultima;
    }

    public void setUltima(Celula Ultima) {
        this.Ultima = Ultima;
    }

    public int getTotalDeElementos() {
        return TotalDeElementos;
    }

    public void setTotalDeElementos(int TotalDeElementos) {
        this.TotalDeElementos = TotalDeElementos;
    }
        
        

    public Deque()
    {
        Primeira = null;
        Ultima = null;
        TotalDeElementos = 0;
    }

    public Deque(T elemento)
    {
        Primeira = null;
        Ultima = null;
        TotalDeElementos = 0;
        InserirNoInicio(elemento);
    }
    
    public void InserirNoInicio(T elemento)
    {
        Celula nova = new Celula(elemento);

        if (TotalDeElementos == 0)
        {
            this.Primeira = this.Ultima = nova;
            TotalDeElementos++;
        }
        else
        {            
            nova.setProximo(Primeira);
            this.setPrimeira(nova);
            this.TotalDeElementos++;            
        }

    }

    public void InserirNoFim(T elemento)
    {
        Celula ultima = new Celula(elemento);

        if (TotalDeElementos == 0)
        {
            this.Primeira = this.Ultima = ultima;
            this.TotalDeElementos++;
        }
        else
        {
            this.Ultima.Proxima = ultima;
            this.Ultima = ultima;
            this.TotalDeElementos++;
        }

    }
    
    public boolean existeDado(T elemento){
        Iterador<T> it = new Iterador<T>(this.Primeira);
        int i = 0;
        while (it.hasNext() && elemento != it.getAtual().Elemento)
        {
            i++;
            it.next();
        }
        if(i == this.TotalDeElementos){
            System.out.println("O elemento não se encontra no deque");
            return false;
        }else{
            System.out.println("O elemento está no deque e é o: " + (i+1) + " elemento.");
        }
        return true;
    }

    public boolean isEmpty(){
        if(this.TotalDeElementos == 0){
            return true;
        }else{
            return false;
        }
    } 
    
    public T RecuperarInicio(){
        return (T) this.Primeira.getElemento();
    }
    
    public T RecuperarFim(){
        return (T) this.Ultima.getElemento();
    }
    
    public void AlterarInicio(T elemento){
        if(this.isEmpty()){
            System.out.println("O deque está vazio, impossível alterar um valor");
        }else{
            Celula nova = new Celula(elemento);
            nova.setProximo(this.Primeira.Proxima);
            this.setPrimeira(nova);            
        }
    }

    public void AlterarFim(T elemento){
        if(this.isEmpty()){
            System.out.println("O deque está vazio, impossível alterar um valor");
        }else{
            Celula ultima = new Celula(elemento);
            Iterador<T> it = new Iterador<T>(this.Primeira);
            int i = 1;
            while (it.hasNext() && i < this.TotalDeElementos)
            {
                i++;
                it.next();
            }
            it.getAtual().setElemento(ultima.Elemento);
        }
    }

    public void RemoverInicio(){
        if (this.TotalDeElementos == 0)
        {
            System.out.println("O deque está vazio!");
        }

        else if (this.Primeira == this.Ultima)
        {

            this.Primeira = this.Ultima = null;
            this.TotalDeElementos--;
        }
        else
        {
            this.Primeira = this.Primeira.Proxima;
            this.TotalDeElementos--;
        }
    }
    
    public void RemoverFim(){
        if (this.TotalDeElementos == 0)
        {
            System.out.println("O deque está vazia!");
        }

        else if (this.Primeira == this.Ultima)
        {

            this.Primeira = this.Ultima = null;
            this.TotalDeElementos--;
        }
        else
        {
            Celula ultima = new Celula();
            Iterador<T> it = new Iterador<T>(this.Primeira);
            int i = 0;
            while (it.hasNext() && i < this.TotalDeElementos-2)
            {
                i++;
                it.next();
            }
            this.setUltima(it.getAtual());
            System.out.println("Ultimo elemento: " + this.getUltima().Elemento);
            this.Ultima.setProximo(ultima);
            this.TotalDeElementos--;
        }
    }

    public int Tamanho(){
        return this.TotalDeElementos;
    }
    
    public void listaDeque(){
        if(this.TotalDeElementos == 0){
            System.out.println("O deque está vazio!");
        }else{
            System.out.println("Listando Deque:\n");
            Iterador<T> it = new Iterador<T>(this.Primeira);
            int i = 0;
            while (it.hasNext())
            {
                System.out.println(it.getAtual().Elemento);
                it.next();
            }
            System.out.println("\n");            
        }
    }

    public void Limpa()
    {
        this.Primeira = this.Ultima = null;
        this.TotalDeElementos = 0;
    }  
}
