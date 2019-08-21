/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciostring;

/**
 *
 * @author Corin V
 */
public class Palabra {
 
    private  String palabra;
    private  char [] cadenaPalabra;
    public Palabra(String dato){
        palabra=dato;
        cadenaPalabra=conversionCaracter();  
    }

    private char[] conversionCaracter() {
       return palabra.toCharArray();
    }

    public void identificarFaltantes() {
        boolean primeraVez=true;
        char unico='o';
        for(int i=0;i<palabra.length();i++){
            if(primeraVez){              
                unico=cadenaPalabra[i];
                primeraVez=false;
                imprimir(unico,cadenaPalabra[i]);              
            }else{
                if(unico==cadenaPalabra[i]){
                    unico=validarLetra(unico,i);                    
                }
                if(unico=='1')
                       unico=validarRepeticion(cadenaPalabra[i]);
                imprimir(unico,cadenaPalabra[i]);
            }            
        }        
    }

    private char validarLetra(char unico, int posicionUnico) {
        int acumulador;
        for(int i=0;i<posicionUnico;i++){
            if(unico!=cadenaPalabra[i]){
                acumulador=0;
                for(int j=0;j<posicionUnico;j++){                    
                    if(cadenaPalabra[i]==cadenaPalabra[j]){
                           acumulador++;
                    }
                }
                if(acumulador==1){
                    return cadenaPalabra[i];
                }
            }              
        }
     
     return '1';    
    }

    private void imprimir(char unico,char letra) {
        String mensaje;
        if(unico=='1'){
            System.out.println(letra+" Todos las letras se repiten ");  
        }else{
            System.out.println(letra+" La primera letra que no se repite es: "+unico);  
        }
    
    }

    private char validarRepeticion(char letra) {
        int contador=0;
        for(char dato:cadenaPalabra){
                if(dato==letra){
                    contador++;
                }
         }
        if(contador==1)
           return letra;
        else
           return '1'; 
    }

}
