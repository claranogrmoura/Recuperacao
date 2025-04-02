/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author CLARA
 */
public class Moto extends Veiculo{
    int cilindrada; 
     public Moto(String modelo, String placa, int ano, int cilindrada) {
        super(modelo, placa, ano);  
        this.cilindrada = cilindrada;         
        
    }
     public void exibirMoto(){
         exibirDetalhes();
         System.out.println("CILINDRADA: " + cilindrada);
     }
    
}
