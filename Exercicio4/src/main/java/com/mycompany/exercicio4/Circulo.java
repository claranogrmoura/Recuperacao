/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author CLARA
 */
public class Circulo extends Forma{
    double raio; 
    public Circulo(String nome, double raio){
    super(nome); 
     this.raio = raio; 
    }
    public double areaCirculo(){
        exibirNome(); 
       return 3.14 * (raio*raio);
    }
       public void infoCirculo(){
        System.out.println("RAIO " + raio); 
       }
        
       
    

} 