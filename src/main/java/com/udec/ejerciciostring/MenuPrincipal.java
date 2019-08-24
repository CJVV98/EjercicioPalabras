/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciostring;
import java.util.Scanner;

/**
 *
 * @author Corin Viracachá
 * Clase principal, en esta clase se solicita la palabra
 */
public class MenuPrincipal {
    /**
     * Constructor de la clase, en este se hace llamado al metodo de solicitar palabra
     */
    public MenuPrincipal(){
        solicitarPalabra();
    }
    public static void main(String ... arg){
        MenuPrincipal menu=new MenuPrincipal();
    }
    /**
     * En este metodo se solicita al usuario una palabra
     */
    public static void solicitarPalabra(){
        String palabra;
        Scanner ingreso=new Scanner(System.in);
        System.out.print("Ingrese Palabra: ");
        palabra=ingreso.nextLine();
        Palabra clasePalabra=new Palabra(palabra);  
        clasePalabra.identificarFaltantes();
    }
    
}
