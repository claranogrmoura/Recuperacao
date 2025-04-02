/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author CLARA
 */
public class Gerente extends Funcionario {
    
    String departamento;
    
  
    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);  
        this.departamento = departamento;
    }
    
    
    public void InfoGerente() {
        Info();  
        System.out.println("Departamento: " + departamento);
    }
}
