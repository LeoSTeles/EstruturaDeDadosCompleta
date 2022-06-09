/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilha;

/**
 *
 * @author 1221105474
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cidades 1
        Cidade a3 = new Cidade("3", 0);
        Cidade a5 = new Cidade("5", 31.9);
        Cidade a7 = new Cidade("7", 17.3);
        Cidade a8 = new Cidade("8",13.3);
        
        
        
        //Instanciando as pilhas
        Pilha estrada1 = new Pilha();
        estrada1.Push(a5);
        estrada1.Push(a3);
        estrada1.Push(a7);
        estrada1.Pop();
        estrada1.Push(a8);
        estrada1.Pop();
        
        
        estrada1.listaPilha();
        
                
    }
    
}