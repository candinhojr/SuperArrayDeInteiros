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
public class SuperArrayDeInteiros {

    private ArrayInteiros array;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        SuperArrayDeInteiros testeArrayInteiros = new SuperArrayDeInteiros();
        testeArrayInteiros.inicia();
    }

    private void inicia() {
        //instancio o Array de inteiros
        this.array = new ArrayInteiros(-6, -1);
        //Inicio dos testes
        //Testes Atribui
        try {
            this.array.atribui(-5, 50);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            this.array.atribui(1, 80);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        try {
            this.array.atribui(0, 50);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        try {
            System.out.println("Valores: " + this.array.acessa(-5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        try {
            System.out.println("Valores: " + this.array.acessa(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        try {
            System.out.println("Valores: " + this.array.acessa(-1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
    
}
