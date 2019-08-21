/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciostring;
import java.util.Scanner;
/**
 *
 * @author Corin V
 */
public class MenuPrincipal {
    public MenuPrincipal(){
        solicitarPalabra();
    }
    public static void main(String ... arg){
        MenuPrincipal menu=new MenuPrincipal();
    }
    
    public static void solicitarPalabra(){
        String palabra;
        Scanner ingreso=new Scanner(System.in);
        System.out.print("Ingrese Palabra: ");
        palabra=ingreso.nextLine();
        Palabra clasePalabra=new Palabra(palabra);  
        clasePalabra.identificarFaltantes();
    }
    
}
