package com.udec.ejerciciovector;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase define los metodos para manipular los datos del vector.
 * @author Cristian Perez
 */
public class NumerosVector {
    /**
     * Lista para recibir n cantidad de numeros*/
    private List<Integer> listaNumeros = new ArrayList<Integer>();
    /**
     * Vector que almacena los numeros*/
    private Integer[] numeros =new Integer[listaNumeros.size()]; 
    /**
     * Scanner para recibir valores por teclado*/
    Scanner teclado=new Scanner(System.in); 
    
    /**
     * Metodo para recibir los numeros y almacenarlos en un vector.
     */
    public void llenarVector(){
        char seleccion;
        do {
            System.out.print("ingresar numero:");
            listaNumeros.add(teclado.nextInt());
            System.out.println("Desea ingresar otro numero? Si= s/ No= n ");
            seleccion=teclado.next().charAt(0);
        } while (seleccion=='s');
        numeros = listaNumeros.toArray(numeros);   
    } //Cierre del método.
    /**
     * Metodo para organizar los numeros almacenados en el vector de menor a mayor.
     */
    public void ordenamiento(){
        int aux;
        for (int i = 0; i<numeros.length-1; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[i]>numeros[j]){
                    aux=numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=aux;
                }
            }
            
        }
        System.out.print("Los numeros organizados de menor a mayor:");
        for (int k = 0; k < numeros.length; k++) {
                System.out.print(" "+numeros[k]);   
            }
    }//Cierre del método.
    /**
     * Metodo para encontrar el numero mayor.
     */
    public void numeroMayor(){
        int mayor;
        mayor=numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>mayor) {
                mayor=numeros[i];
            }
        }
        System.out.println("el numero mayor es:" + mayor);
    }//Cierre del método.
    /**
     * Metodo para encontrar el numero menor.
     */
     public void numeroMenor(){
        int menor;
        menor=numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]<menor) {
                menor=numeros[i];
            }
        }
        System.out.println("el numero menor es:" + menor);
     }//Cierre del método.
     /**
      * Metodo para encontrar los numeros que faltan en la secuencia almacenada en el vector.
      */
     public void numerosFaltantes(){
        List<Integer> numFaltantes = new ArrayList<Integer>();
        int comparador;
        comparador=numeros[0];
        int diferencia;
        for (int i = 0; i < numeros.length; i++) {
            diferencia=numeros[i]-comparador;
            if (diferencia>1) {
                for (int j = 1; j < diferencia; j++) {
                    numFaltantes.add(comparador+j);
                }
            }
        comparador=numeros[i];
     }
        Integer[] faltantes =new Integer[numFaltantes.size()]; 
        faltantes = numFaltantes.toArray(faltantes);
            System.out.println("Los numeros que faltan son:");
            for (int k = 0; k < faltantes.length; k++) {
            System.out.print(" "+faltantes[k]);   
            }
}//Cierre del método.
}//Cierre de a clase.