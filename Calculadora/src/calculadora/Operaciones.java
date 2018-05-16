/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author estudios
 */
public class Operaciones {
    int resultado;
    
    public int suma(int num1, int num2){
        resultado=num1+num2;
        
        
        return resultado;
    }
    public int resta(int num1, int num2){
        resultado=num1-num2;
        
        
        return resultado;
    }public int multi(int num1, int num2){
        resultado=num1*num2;
        
        
        return resultado;
    }public int div(int num1, int num2){
        resultado=num1/num2;
        
        
        return resultado;
    }
}
