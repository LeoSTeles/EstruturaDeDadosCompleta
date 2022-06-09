/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimples;

/**
 *
 * @author leona
 */
public class Celula {

    public Celula proximo;
    public Object elemento;

    public Celula() {
    }

    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public Celula(Celula proximo, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

}
