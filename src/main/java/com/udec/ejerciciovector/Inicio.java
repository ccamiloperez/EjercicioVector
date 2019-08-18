/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciovector;
/**
 * Esta es la clase inicio donde se realiza la creacion del objeto y el uso de los metodos de la clase NumerosVector.
 * @author Cristian Perez
 */
public class Inicio {
    /**
     * Constructor de la clase Inicio
     */
      public Inicio(){
       System.out.println("BIENVENIDO");
       NumerosVector num=new NumerosVector();
       num.llenarVector();
       num.ordenamiento();
       System.out.println("");
       num.numeroMayor();
       num.numeroMenor();
       System.out.println("");
       num.numerosFaltantes();
       System.out.println("");
}//Cierre del constructor.
}//Cierre de la clase.
