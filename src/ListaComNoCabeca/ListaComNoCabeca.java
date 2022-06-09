/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComNoCabeca;

/**
 *
 * @author 1221105474
 */
public class ListaComNoCabeca<T> {

    private Celula Primeira;
    private Celula Anterior;
    private Celula Ultima;
    private Celula Cabeca = new Celula();
    public int TotalDeElementos;

    public ListaComNoCabeca()
    {
        Primeira = null;
        Ultima = null;
        Cabeca.Proxima = Primeira;
        Cabeca.Anterior = Ultima;
        TotalDeElementos = 0;
    }

    public ListaComNoCabeca(T elemento)
    {
        Primeira = null;
        Ultima = null;
        TotalDeElementos = 0;
        AdicionaNoComeco(elemento);

        Cabeca.Proxima = Primeira;
        Cabeca.Anterior = Ultima;
    }


    //adiciona no começo
    public void AdicionaNoComeco(T elemento)
    {
        Celula nova = new Celula(elemento);

        if (TotalDeElementos == 0)
        {
            Primeira = Ultima = nova;
            TotalDeElementos++;
        }
        else
        {
            nova.Proxima = Primeira;
            Primeira = nova;
            TotalDeElementos++;
        }
    }

    //adiciona na posicao
    public void Adiciona(T elemento, int posicao)
    {
        Celula nova = new Celula(elemento);

        if (TotalDeElementos == 0 || posicao == 0)
        {
            AdicionaNoComeco(elemento);
        }
        else
        {

            Celula atual = Primeira;

            Iterador<T> it = new Iterador<T>(Primeira);

            int k = 0;
            while (it.hasNext())
            {
                if (k < posicao - 1)
                {
                    atual = atual.Proxima;
                    k++;

                }
                else
                {

                    break;
                }
            }

            Celula proxima = atual.Proxima;
            atual.Proxima = nova;
            nova.Proxima = proxima;
            Ultima = nova;
            atual.Anterior = RecuperaCelula(posicao - 1);
            Cabeca.Proxima = Primeira;
            Cabeca.Anterior = Ultima;

            TotalDeElementos++;

        }
    }

    //recupera a posicão
    public T Recupera(int posicao)
    {
        T resultado = null;
        if (TotalDeElementos == 0)
        {
            System.out.println("A lista está vazia!!");

        }

        else if (posicao < 0 || posicao >= TotalDeElementos)
        {
            System.out.println("A posição " + posicao + 
                " é invalida!");

        }

        else
        {
            Iterador<T> it = new Iterador<T>(Primeira);
            int i = 0;
            while (it.hasNext() && i != posicao)
            {
                it.next();
                i++;
            }
            resultado = (T) it.getAtual().Elemento;
            return (T) it.getAtual().Elemento;
        }
        return resultado;
    }
    
    public Celula RecuperaCelula(int posicao)
    {
        Celula resultado = new Celula();
        if (TotalDeElementos == 0)
        {
            System.out.println("A lista está vazia!!");

        }

        else if (posicao < 0 || posicao >= TotalDeElementos)
        {
            System.out.println("A posição " + posicao +
                " é invalida!");

        }

        else
        {
            Iterador<T> it = new Iterador<T>(Primeira);
            Celula atual = Primeira;
            int i = 0;
            while (it.hasNext())
            {
                if (i != posicao)
                {
                    atual = atual.Proxima;
                    i++;
                }
                else
                {
                    break;
                }
            }
            resultado = atual;
            return atual;
        }
        return resultado;
    }

    public void RemoveInicio()
    {
        if (TotalDeElementos == 0)
        {
            System.out.println("A lista está vazia!");
        }

        else if (Primeira == Ultima)
        {

            Primeira = Ultima = null;
            Cabeca.Proxima = Primeira;
            Cabeca.Anterior = Ultima;
            TotalDeElementos--;
        }
        else
        {
            Primeira = Primeira.Proxima;
            Primeira.Anterior = null;
            Cabeca.Proxima = Primeira;
            Cabeca.Anterior = Ultima;
            TotalDeElementos--;
        }
    }

    public boolean ExisteDado(T elemento)
    {
        Celula atual = Primeira;

        Iterador<T> it = new Iterador<T>(Primeira);

        int k = 0;
        while (it.hasNext())
        {
            if (k < Tamanho())
            {
                if (atual.Elemento == elemento)
                {
                    return true;
                }
                atual = atual.Proxima;                 
                k++;

            }
            else
            {

                break;
            }
        }

        return false;
    }

    public int Tamanho()
    {
        return this.TotalDeElementos;
    }

    public void Limpa()
    {
        Primeira = Ultima = null;
        TotalDeElementos = 0;
    }
    public void AdicionaFim(T elemento)
    {
        Celula nova = new Celula(elemento);

        if (TotalDeElementos == 0)
        {
            Primeira = Ultima = nova;
            TotalDeElementos++;
        }
        else
        {
            Ultima.Proxima = nova;
            Ultima = nova;
            Ultima.Anterior = RecuperaCelula(TotalDeElementos - 1);
            Cabeca.Proxima = Primeira;
            Cabeca.Anterior = Ultima;
            TotalDeElementos++;

        }

    }
    public void RemoveFim()
    {
        if (TotalDeElementos == 0)
        {
            System.out.println("A lista está vazia!");
        }else{
            Iterador<T> it = new Iterador<T>(Primeira);
            int k = 0;
            while (it.hasNext() && k != this.TotalDeElementos-2)
            {
                it.next();
                k++;
            }
            it.getAtual().setProximo(null);
            this.TotalDeElementos--;
        }
    }
    
    public void listarNoCabeca(){
        System.out.println("Listando:\n");
        if(this.TotalDeElementos == 0){
            System.out.println("A lista está vazia!");
        }else{
            Iterador<T> it = new Iterador<T>(this.Primeira);
            int i = 0;
            while (it.hasNext())
            {
                System.out.println(it.getAtual().Elemento);
                it.next();
            }                
        }
        System.out.println("\n");
    }

    public void Remove(int posicao)
    {
        if(posicao >= this.TotalDeElementos){
            System.out.println("Posição Inválida!");
        }
        else if (TotalDeElementos == 0)
        {
            System.out.println("A lista está vazia!");
        }
        else if (posicao == this.TotalDeElementos - 1)
        {
            RemoveFim();
        }
        else if (posicao == 0)
        {
            RemoveInicio();
        }
        else
        {
            Celula atual = Primeira;

            Iterador<T> it = new Iterador<T>(Primeira);

            int k = 0;
            while (it.hasNext())
            {
                if (k < Tamanho() - 1)
                {
                    if (k == posicao - 1)
                    {

                        atual.Proxima = atual.Proxima.Proxima;
                        atual.Anterior = RecuperaCelula(posicao - 1);
                        TotalDeElementos--;
                        Cabeca.Proxima = Primeira;
                        Cabeca.Anterior = Ultima;
                        break;
                    }

                    atual = atual.Proxima;

                    it.getAtual();
                    k++;

                }
                else
                {

                    break;
                }


            }
        }
    }
}
