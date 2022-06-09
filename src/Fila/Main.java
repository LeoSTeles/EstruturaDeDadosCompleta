/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fila;

/**
 *
 * @author leona
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Aluno a1 = new Aluno("Anderson", 42);
        Aluno a2 = new Aluno("Ana", 31);
        Aluno a3 = new Aluno("José", 23);*/
        

        Aluno a3 = new Aluno("3", 10);
        Aluno a5 = new Aluno("5", 10);
        Aluno a7 = new Aluno("7", 10);
        Aluno a8 = new Aluno("8", 10);

        Fila fila = new Fila();

        //ListaSimples<Aluno> lista = new ListaSimples<Aluno>();

        fila.Inserir(a5);  //funcionando
        fila.Inserir(a7);
        fila.Inserir(a3);
        fila.Remover();
        fila.listaFila();
    
        //System.out.println(fila.isEmpty());
        //System.out.println(fila.Recuperar());
        
        //fila.Alterar(a3); Funcionando
        
        //fila.Remover(); Funcionando
        //fila.Tamanho(); Funcionando
        
        
    }
    
}
