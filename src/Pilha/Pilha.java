/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pilha;

import java.util.ArrayList;

/**
 *
 * @author leona
 */
public class Pilha<T> {
     
        private Celula Topo;
        private int TotalDeElementos;

        public Celula getTopo() {
            return Topo;
        }

        public void setTopo(Celula Topo) {
            this.Topo = Topo;
        }

        public int getTotalDeElementos() {
            return TotalDeElementos;
        }

        public void setTotalDeElementos(int TotalDeElementos) {
            this.TotalDeElementos = TotalDeElementos;
        }

        public Pilha()
        {
            this.Topo = null;
            this.TotalDeElementos = 0;
        }

        public Pilha(T elemento)
        {
            this.TotalDeElementos = 0;
            this.Push(elemento);
        }
        
        public void Push(T elemento){
            if(this.tamanho() == 0){
                Celula nova = new Celula(elemento);
                this.setTopo(nova);
                this.TotalDeElementos++;
            }else{
                Celula novaCelula = new Celula(elemento);
                novaCelula.setProximo(Topo);
                this.setTopo(novaCelula);
                this.TotalDeElementos++;
            }   
        }
        
        public boolean existeDado(){
            if(this.getTopo() == null){
                return false;
            }else{
                return true;
            }
        }
        
        public void encontraDado(T elemento){
            Iterador<T> it = new Iterador<T>(this.Topo);
            int i = 0;
            while (it.hasNext() && elemento != it.getAtual().Elemento)
            {
                i++;
                it.next();
            }
            if(i == this.TotalDeElementos){
                System.out.println("O elemento não se encontra na pilha");
            }else{
                System.out.println("O elemento está na pilha e é o: " + (i+1) + " elemento.");
            }
        }
        
        public boolean isEmpty(){
            if(this.TotalDeElementos == 0){
                return true;
            }else{
                return false;
            }
        } 
        
        public T Top(){
            if(this.TotalDeElementos == 0){
                T elemento = null;
                return elemento;
            }else{
                return (T) this.Topo.Elemento;
            }
        }
        
        public void Pop(){
            Celula novo_topo = new Celula(this.Topo.Proxima.Elemento);
            novo_topo.setProximo(this.Topo.Proxima.Proxima);
            this.setTopo(novo_topo);
            this.TotalDeElementos--;
        }
        
        public void Pull(T elemento){
            Celula novo_topo = new Celula(elemento);
            novo_topo.setProximo(this.Topo.Proxima);
            this.setTopo(novo_topo);
        }
        
        public int tamanho(){
            return this.getTotalDeElementos();
        }
        
        public double CalculaDistancia(Pilha pilha, Cidade a, Cidade b){
            double soma = 0;
            double posA = 0;
            double posB = 0;
            
            for(int i=0; i<this.TotalDeElementos-1; i++){
                System.out.println("Elemento do Topo da Pilha: " + pilha.Topo.Elemento + " Nome da Cidade: " + a.getRegiao());
                if(pilha.Topo.Elemento.toString().equals(a.getRegiao())){
                    posA = i;
                }else if(pilha.Topo.Elemento == b.getRegiao()){
                    posB = i;
                }
                pilha.Pop();
            }
            
            /*Pilha pilhaSoma = new Pilha();
            for(int i=0; i<this.tamanho(); i++){
                pilhaSoma.Push(pilha.Top());
                if(pilhaSoma.Topo.Elemento == a.getRegiao()){
                    soma += a.getDistancia();
                }
            }*/
            
            return posA;
        }
        
        public void listaPilha(){
            System.out.println("Listando Pilha:\n");
            Iterador<T> it = new Iterador<T>(this.Topo);
            int i = 0;
            while (it.hasNext())
            {
                System.out.println(it.getAtual().Elemento);
                it.next();
            }
            System.out.println("\n");
        }
        
        public void limpa(){
            this.Topo = null;
            this.TotalDeElementos = 0;
        }
}
