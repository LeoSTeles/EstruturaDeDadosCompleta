/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fila;

/**
 *
 * @author leona
 */
class Fila<T>
    {       
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
        
        

    public Fila()
    {
        Primeira = null;
        Ultima = null;
        TotalDeElementos = 0;
    }

    public Fila(T elemento)
    {
        Primeira = null;
        Ultima = null;
        TotalDeElementos = 0;
        Inserir(elemento);
    }

    public void Inserir(T elemento)
    {
        Celula nova = new Celula(elemento);

        if (TotalDeElementos == 0)
        {
            Primeira = Ultima = nova;
            TotalDeElementos++;
        }
        else
        {
            Ultima.Proxima = nova;
            Ultima = nova;
            TotalDeElementos++;
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
            System.out.println("O elemento não se encontra na fila");
            return false;
        }else{
            System.out.println("O elemento está na fila e é o: " + (i+1) + " elemento.");
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
        
    public T Recuperar(){
        if(this.isEmpty()){
            return null;
        }else{
            return (T) this.Primeira.Elemento;
        }

    }

    public void Alterar(T elemento){
        if(this.isEmpty()){
            System.out.println("A fila está vazia, impossível alterar um valor");
        }else{
            Celula nova = new Celula(elemento);
            nova.setProximo(this.Primeira.Proxima);
            this.setPrimeira(nova);
        }
    }
        
    public void Remover(){
        if (TotalDeElementos == 0)
        {
            System.out.println("A lista está vazia!");
        }

        else if (Primeira == Ultima)
        {

            Primeira = Ultima = null;
            TotalDeElementos--;
        }
        else
        {
            Primeira = Primeira.Proxima;
            TotalDeElementos--;
        }
    }

    public int Tamanho(){
        return this.TotalDeElementos;
    }

    public void Limpa()
    {
        Primeira = Ultima = null;
        TotalDeElementos = 0;
    }
        
    public void listaFila(){
        System.out.println("Listando Fila:\n");
        if(this.TotalDeElementos == 0){
            System.out.println("A fila está vazia!");
        }else{
            Iterador<T> it = new Iterador<T>(this.Primeira);
            int i = 0;
            while (it.hasNext())
            {
                System.out.println(it.getAtual().Elemento);
                it.next();
            }                
        }
        System.out.println("\n");
    }
}
