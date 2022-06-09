/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEncadeada;

/**
 *
 * @author leona
 */
public class Celula {

    public Celula Proxima;
    public Object Elemento;

    public Celula() {
    }

    public Celula(Object elemento) {
        this.Elemento = elemento;
    }

    public Celula(Celula proximo, Object elemento) {
        this.Proxima = proximo;
        this.Elemento = elemento;
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