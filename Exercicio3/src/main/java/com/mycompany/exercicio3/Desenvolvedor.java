/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author CLARA
 */
public class Desenvolvedor extends Funcionario{
     String lingProgramacao; 
      public Desenvolvedor(String nome, int idade, double salario, String lingProgramacao) {
        super(nome, idade, salario);  
        this.lingProgramacao = lingProgramacao;
      
}
      public void InfoDesenvolvedor() {
        Info();  
        System.out.println("LINGUAGEM DE PROGRAMAÇÃO " + lingProgramacao);
    }
}
