/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author CLARA
 */
public class Retangulo extends Forma {
    double largura; 
    double altura; 
    public Retangulo(String nome, double largura, double altura){
    super(nome); 
     this.largura = largura;
     this.altura = altura; 
    }
     public double areaRetangulo(){
          exibirNome(); 
       return largura * altura;
         
     }
      public void infoRetangulo(){
        System.out.println("AREA" + areaRetangulo()); 
       }
}
    

