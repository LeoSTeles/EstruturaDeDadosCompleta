/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ListaSimples;

/**
 *
 * @author leona
 */
public class Main
{
	public static void main(String[] args) {
		
        Aluno a1 = new Aluno("Anderson", 42);
        Aluno a2 = new Aluno("Ana", 31);
        Aluno a3 = new Aluno("José", 23);
        Aluno a4 = new Aluno("Leonardo", 24);
        Aluno a5 = new Aluno("Pedro", 35);

        ListaSimples lista = new ListaSimples();
	    
	    //ListaSimples<Aluno> lista = new ListaSimples<Aluno>();
        
        lista.adicionaInicio(a1);  //funcionando
        lista.adicionaInicio(a2);  //funcionando
        lista.adicionaInicio(a3);  //funcionando  
        lista.adiciona(a4, 2);
        
        lista.listarLista();
	}
}