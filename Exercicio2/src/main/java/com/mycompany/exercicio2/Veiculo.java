

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author CLARA
 */
class Veiculo{
  String modelo; 
String placa; 
 int ano; 
    
    public Veiculo(String modelo, String placa, int ano){
        this.modelo = modelo; 
        this.placa = placa;
        this.ano = ano; 
    }
    
    public void exibirDetalhes() {
        System.out.println("MODELO: " + modelo);
        System.out.println("MODELO: " + placa);
        System.out.println("ANO: " + ano);
    }
}
   
