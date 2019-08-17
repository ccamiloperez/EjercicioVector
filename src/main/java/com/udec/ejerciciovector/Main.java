/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciovector;

/**
 *
 * @author Cristian Perez
 */
import com.udec.ejerciciovector.NumerosVector;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       NumerosVector num=new NumerosVector();
       num.llenarVector();
       num.ordenamiento();
       num.imprimir();
        System.out.println("");
      num.numeroMayor();
      num.numeroMenor();
    }
    
}
