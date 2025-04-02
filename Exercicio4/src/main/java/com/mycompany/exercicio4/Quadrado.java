/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author CLARA
 */
public class Quadrado extends Forma {
    double lado; 
     
    public Quadrado(String nome, double lado){
        super(nome);
        this.lado = lado; 
}
public double areaQuadrado(){
        exibirNome(); 
       return 3.14 * (lado *lado );
    }
       public void infoQuadrado(){
        System.out.println("AREA:  " + areaQuadrado()); 
       }
       
}
        