package ListaComNoCabeca;

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

                ListaComNoCabeca lista = new ListaComNoCabeca();
	            
                lista.AdicionaFim(a1);//Funcionando
                lista.AdicionaFim(a2);//Funcionando
                lista.Adiciona(a4, 1);
                lista.AdicionaNoComeco(a5);
                
                
                System.out.println(lista.Tamanho());
                lista.listarNoCabeca();
        
   
	}
}
