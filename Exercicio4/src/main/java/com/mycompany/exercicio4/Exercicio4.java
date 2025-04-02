/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4;

/**
 *
 * @author CLARA
 */
public class Exercicio4 {

    public static void main(String[] args) {
        ///CIRCULO
        Circulo circulo1 = new Circulo ("Circulo", 6);
        ///////retangulo
        Retangulo retangulo1 = new Retangulo ("Retangulo", 3,6); 
        //////Quadrado
        Quadrado quadrado1 = new Quadrado ("Quadrado", 5); 
        
        
        ////////circulo
        System.out.println("----------- INFORMAÇÕES DO CIRCULO -----------");
        circulo1.areaCirculo();
        circulo1.infoCirculo();
        
        //////retangulo
       System.out.println(" ------ INFORMAÇÕES DO RETANGULO ----");
       retangulo1.areaRetangulo(); 
       retangulo1.infoRetangulo();
       
       ////////////////quadrado
      System.out.println("-------- INFORMAÇÕES DO QUADRADO ---------"); 
      quadrado1.areaQuadrado(); 
      quadrado1.infoQuadrado();
    }
}
