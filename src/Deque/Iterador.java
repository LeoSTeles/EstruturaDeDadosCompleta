/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deque;

/**
 *
 * @author leona
 */
import java.util.Iterator;

public class Iterador<T> implements Iterator{

    private Celula atual;

    public Iterador(Celula atual) {
        this.atual = atual;
    }
    
    @Override
    public boolean hasNext() {
        if(atual!=null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        T elemento = (T) atual.getElemento();
        atual = atual.getProximo();
        return elemento;
    }

    public Celula getAtual() {
        return atual;
    }
}

