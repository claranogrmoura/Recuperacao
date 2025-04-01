/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author CLARA
 */
    public class Carro extends Veiculo {
    int numeroPortas;
    
   
    public Carro(String modelo, String placa, int ano, int numeroPortas) {
        super(modelo, placa, ano);  
        this.numeroPortas = numeroPortas;
    }
    
   
    public void infoCarro() {
        exibirInformacoes();  // Chama o método da classe base (Veiculo)
        System.out.println("Número de Portas: " + numeroPortas);
    }
}

