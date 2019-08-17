package com.udec.ejerciciovector;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cristian Perez
 */
public class NumerosVector {
    
    List<Integer> listaNumeros = new ArrayList<Integer>();
    Integer[] numeros =new Integer[listaNumeros.size()]; 
    Scanner teclado=new Scanner(System.in);

    public NumerosVector() {
        
    }
    
      
    
    public void llenarVector(){
        char seleccion;
        do {
            System.out.print("ingresar numero:");
            listaNumeros.add(teclado.nextInt());
            System.out.println("Desea ingresar otro numero? Si= s/ No= n ");
            seleccion=teclado.next().charAt(0);
        } while (seleccion=='s');
        numeros = listaNumeros.toArray(numeros);   
    } 
    
    
    
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
    }
    
    
     public void imprimir(){
    for (int i = 0; i < numeros.length; i++) {
            System.out.print("  "+numeros[i]);
        }  
    }
    
    public void numeroMayor(){
        int mayor;
        mayor=numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>mayor) {
                mayor=numeros[i];
            }
        }
        System.out.println("el numero mayor es:" + mayor);
    }
    
     public void numeroMenor(){
        int menor;
        menor=numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]<menor) {
                menor=numeros[i];
            }
        }
        System.out.println("el numero menor es:" + menor);
     }
}

