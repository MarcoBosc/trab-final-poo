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
public class Estagiario extends Funcionario implements Serializable{
    private double bolsa;
    private int horasServico;

    public Estagiario(String nome, int idade, String endereco, String sexo, double altura, String telefone,
            String registro, double salario, boolean statusDetencao) {
        super(nome, idade, endereco, sexo, altura, telefone, registro, salario, statusDetencao);

    }



}

