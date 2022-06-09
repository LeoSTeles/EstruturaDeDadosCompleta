/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Deque;

/**
 *
 * @author leona
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Anderson", 42);
        Aluno a2 = new Aluno("Ana", 31);
        Aluno a3 = new Aluno("José", 23);
        Aluno a4 = new Aluno("Leonardo", 30);

        Deque deque = new Deque();
        /*Funcionando:
        Inserir no Início,
        Inserir no Fim,
        Existe Dado,
        isEmpty,
        Recuperar Inicio,
        Recuperar Fim,
        Alterar Início,
        Alterar Fim,
        Remover Inicio,
        Remover Fim,
        Tamanho
        */

        deque.InserirNoInicio(a1);  //funcionando
        deque.InserirNoInicio(a2);
        deque.InserirNoInicio(a3);
        
        deque.listaDeque();
        deque.Limpa();
        deque.listaDeque();
        
       
        //deque.listaDeque();
    }
    
}
