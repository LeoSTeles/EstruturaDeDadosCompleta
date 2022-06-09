package ListaDuplamenteEncadeada;

/**
 *
 * @author 1221105474
 */
public class Main
{
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Anderson", 42);
		Aluno a2 = new Aluno("Ana", 31);
		Aluno a3 = new Aluno("José", 23);
                Aluno a4 = new Aluno("Leonardo", 25);
                Aluno a5 = new Aluno("Paulo", 27);

                ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
	            
                lista.AdicionaNoComeco(a1);//Funcionando
                lista.AdicionaNoComeco(a4);//Funcionando
                lista.AdicionaFim(a5);
                lista.AdicionaFim(a2);
                
                
                
                lista.listarDuplamenteEncadeada();
                lista.Adiciona(a3, 4);
                lista.listarDuplamenteEncadeada();
        
   
	}
}
