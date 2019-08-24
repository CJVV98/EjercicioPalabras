/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciostring;

/**
 *
 * @author Corin V
 * Clase que se encarga de determinar las primeras letras de una palabra
 */
public class Palabra {
    /**
     * palabra, es usado para guardar el dato ingresado por el usuario
     * cadenaPalabra, es usado para guardar la palabra en un vector de caracteres
     */
    private final  String palabra;
    private final  char [] cadenaPalabra;
    /**
     * 
     * @param dato es la palabra que ingresa el uuario
     * En este constructor se asigna los datos a cada variable de la clase
     * Se hace la respectiva conversion de String a un vector de tipo caracter
     */
    public Palabra(String dato){
        palabra=dato;
        cadenaPalabra=palabra.toCharArray();  
    }
    /**
     * Este metodo se encarga de recorrer la cadena de caracteres para identificar la primera letra
     */
    public void identificarFaltantes() {
        boolean primeraVez=true;
        char unico=cadenaPalabra[0];
        for(int i=0;i<palabra.length();i++){
            if(primeraVez){              
                unico=cadenaPalabra[i];
                primeraVez=false;           
            }else{
                if(unico==cadenaPalabra[i]){
                    unico=validarLetra(unico,i);                    
                }
                if(unico=='1') // este if es para validar cuando ya no hay primer letra
                       unico=validarRepeticion(cadenaPalabra[i]);               
            } 
            imprimir(unico,cadenaPalabra[i]);
        }        
    }
    /**
     * Este metodo es usado para verificar cual es la siguiente letra primera siguiente
     * @param unico esta varaible almacena el caracter que durante la lectura es unico
     * @param posicionUnico parametro que envia la posicion del caracter primero de la secuencia
     * @return unico, retorna la nueva primer letra de la cadena
     */
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
     
     return '1';  // Este uno indica que no encontro primeras letras  
    }
    /**
     * Este metodo se encarga de imprimir la secuencia
     * @param unico esta variable almacena la primera letra de la secuencia
     * @param letra esta variable es usada para almacenar que letra se esta leyendo
     */
    private void imprimir(char unico,char letra) {
        if(unico=='1'){
            System.out.println(letra+" Todos las letras se repiten ");  
        }else{
            System.out.println(letra+" La primera letra que no se repite es: "+unico);  
        }
    
    }
    /**
     * Este metodo es usado para determinar la nueva primera letra, cuando ya todas las letras estan 
     * repetidas
     * @param letra esta variable es usada para almacenar que letra se esta leyendo
     * @return la nueva primer letra hallada
     */
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
