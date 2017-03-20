/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superarraydeinteiros;

/**
 *
 * @author Candinho Junior
 */
public class ArrayInteiros {
    //Atributos da classe
    private int[] array;
    private int maximo;
    private int minimo;
    
    //Construtor
    public ArrayInteiros(int inicio, int fim) {
        this.maximo = Math.max(inicio, fim);
        this.minimo = Math.min(fim, inicio);
        //Condição para casos negativos
        if(inicio > fim) {
            this.array = new int[inicio-fim+1];
        } else {
            this.array = new int[fim-inicio+1];
        }
    }
    
    //Método atribui
    public void atribui(int posicao, int valor) throws Exception{
        //Teste para o caso de tentar acessar uma posicao que não exista
        if(posicao > this.maximo) {
            throw new Exception("Não é possível atribuir o valor de " + valor + " pois a posicao " + posicao + " não existe no array");
        } else {
           int posicaoReal = posicao - this.minimo;
           this.array[posicaoReal] = valor;
        }
    }
    
    //Método acessa
    public int acessa(int posicao) throws Exception{
        //Teste de limites valores minimo e maximo
        if(posicao > this.maximo || posicao < this.minimo) {
            throw new Exception("Não é possível acessar o valor, pois a posicao " + posicao + " não existe no array");
        } else {
        int posicaoReal = posicao - this.minimo;
        return this.array[posicaoReal];
        }
    }
}
