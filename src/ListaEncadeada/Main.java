/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ListaEncadeada;

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
        Aluno a4 = new Aluno("Leonardo", 23);

        ListaEncadeada lista = new ListaEncadeada();
	    
	    //ListaSimples<Aluno> lista = new ListaSimples<Aluno>();
        
        lista.AdicionaNoComeco(a1);  //funcionando
        lista.AdicionaNoComeco(a2);  //funcionando
        lista.AdicionaNoComeco(a3);  //funcionando     
        lista.AdicionaFim(a4);
        
        lista.listarEncadeada();
        lista.Remove(2);        
        lista.listarEncadeada();
        //lista.RemoveInicio();  //funcionando
        //lista.RemoveFim();
        
        //a1 = (Aluno) lista.Recupera(0);
        //a2 = (Aluno) lista.Recupera(1);

    }
}