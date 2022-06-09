/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilha;

/**
 *
 * @author 1221105474
 */
public class Cidade {
   private String regiao;
   private double distancia;

    public Cidade() {
    }

    public Cidade(String regiao, double distancia) {
        this.regiao = regiao;
        this.distancia = distancia;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return regiao;
    }
}
