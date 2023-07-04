/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalhadores;

import java.io.Serializable;

/**
 *
 * @author Computacao
 */
public class Funcionario extends Pessoa implements Serializable{
    private String registro;
    private double salario;
    private boolean statusDetencao;

    public Funcionario(String nome, int idade, String endereco, String sexo, double altura, String telefone,
            String registro, double salario, boolean statusDetencao) {
        super(nome, idade, endereco, sexo, altura, telefone);
        this.registro = registro;
        this.salario = salario;
        this.statusDetencao = statusDetencao;
    }

    @Override
    public void fazerAlgumaCoisa() {
        // Implementação específica para a classe Funcionário
        System.out.println("Funcionário fazendo alguma coisa...");
    }

    @Override
    public void outroMetodoAbstrato() {
        // Implementação específica para a classe Funcionário
        System.out.println("Implementação do outro método abstrato na classe Funcionário");
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean getStatusDetencao() {
        return statusDetencao;
    }

    public void setStatusDetencao(boolean statusDetencao) {
        this.statusDetencao = statusDetencao;
    }
}
