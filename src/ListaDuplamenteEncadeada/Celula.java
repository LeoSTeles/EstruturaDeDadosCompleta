/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDuplamenteEncadeada;

/**
 *
 * @author 1221105474
 */
public class Celula {

    public Celula Anterior;
    public Celula Proxima;
    public Object Elemento;
    

    public Celula() {
    }

    public Celula(Object elemento) {
        this.Elemento = elemento;
    }

    public Celula(Celula anterior,Celula proximo, Object elemento) {
        this.Anterior = anterior;
        this.Proxima = proximo;
        this.Elemento = elemento;
    }

    public Celula getAnterior() {
        return Anterior;
    }

    public void setAnterior(Celula anterior) {
        this.Anterior = anterior;
    }
    
    public Celula getProximo() {
        return Proxima;
    }

    public void setProximo(Celula proximo) {
        this.Proxima = proximo;
    }

    public Object getElemento() {
        return Elemento;
    }

    public void setElemento(Object elemento) {
        this.Elemento = elemento;
    }

}