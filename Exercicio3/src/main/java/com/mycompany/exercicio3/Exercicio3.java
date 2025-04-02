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
   
        Gerente gerente = new Gerente("Rebeca", 27, 3000.00, "Phyton");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Paloma", 24, 2000.00, "Java");
        System.out.println("Informações do Gerente:");
        gerente.InfoGerente();
        
        System.out.println();
        
     
        System.out.println("Informações do Desenvolvedor:");
        desenvolvedor.InfoDesenvolvedor();
    }
}

