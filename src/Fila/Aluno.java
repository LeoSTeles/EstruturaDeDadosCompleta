/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fila;

/**
 *
 * @author leona
 */
public class Aluno {
    private String nome;
    private int idade;

    public Aluno(){
        this.nome =" ";
        this.idade=0;
    }

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade= idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}