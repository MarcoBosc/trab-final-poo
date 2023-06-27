/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalhadores;

/**
 *
 * @author Computacao
 */
public class Estagiario extends Funcionario {
    private double bolsa;
    private int horasServico;

    public Estagiario(String nome, int idade, String endereco, String sexo, double altura, String telefone,
            String registro, double salario, boolean statusDetencao, double bolsa, int horasServico) {
        super(nome, idade, endereco, sexo, altura, telefone, registro, salario, statusDetencao);
        this.bolsa = bolsa;
        this.horasServico = horasServico;
    }

    @Override
    public void fazerAlgumaCoisa() {
        // Implementação específica para a classe Estagiário
        System.out.println("Estagiário fazendo alguma coisa...");
    }

    @Override
    public void outroMetodoAbstrato() {
        // Implementação específica para a classe Estagiário
        System.out.println("Implementação do outro método abstrato na classe Estagiário");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public int getHorasServico() {
        return horasServico;
    }

    public void setHorasServico(int horasServico) {
        this.horasServico = horasServico;
    }
}

