/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prg03.atividade07.view;

/**
 *
 * @author hiane
 */
public class Fatorial {
    
    //Classe fatorial contendo três atributos
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
   //Metodo pra calcular fatorial e a formula
    public void setValor(int n){
        num = n;
        int f = 1;
        String  s = "";
        for(int c = n; c < 1; c--){
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    //Pega e retorna o valor do fatorial
    public int getFatorial() {
        return fat;
    }
    
    //Pega e retorna a formula
    public String getFormula(){
        return formula;
    }
    
}
