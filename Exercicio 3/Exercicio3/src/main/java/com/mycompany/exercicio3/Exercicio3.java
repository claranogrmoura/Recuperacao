/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3;

/**
 *
 * @author CLARA
 */
public class Exercicio3 {

    public static void main(String[] args) {
   
        Gerente gerente = new Gerente("Carlos Silva", 45, 8000.00, "TI");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Fernanda Souza", 30, 5000.00, "Java");
        System.out.println("Informações do Gerente:");
        gerente.InfoGerente();
        
        System.out.println();
        
        // Exibindo as informações do desenvolvedor
        System.out.println("Informações do Desenvolvedor:");
        desenvolvedor.InfoDesenvolvedor();
    }
}

