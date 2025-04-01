/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;

/**
 *
 * @author CLARA
 */
public class Exercicio1 {

     public static void main(String[] args) {
        Produto roupa = new Produto("Body", 35.90); 
        Descricao roupa1 = new Descricao("Body", 40.50, 25.00); 

        roupa.exibir(); 
        roupa1.exibirDetalhes(); 
    }
}