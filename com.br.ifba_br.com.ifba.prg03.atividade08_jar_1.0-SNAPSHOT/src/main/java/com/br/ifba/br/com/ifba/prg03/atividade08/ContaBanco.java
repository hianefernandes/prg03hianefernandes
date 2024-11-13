/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.br.ifba.br.com.ifba.prg03.atividade08;


/**
 *
 * @author hiane
 **/

public class ContaBanco {

    // Atributos
    private int numConta;
    private String tipo; // "cc" para Conta Corrente, "cp" para Conta Poupança
    private String dono;
    private float saldo;
    private boolean status; // Status indica se a conta está ativa ou fechada

    // Método Construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    // Métodos Getter e Setter
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Método para abrir conta
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equals("cp")) {
            this.setSaldo(150); // Bônus para conta poupança
        } else if (tipo.equals("cc")) {
            this.setSaldo(50); // Bônus para conta corrente
        }
        System.out.println("Conta aberta com sucesso!");
    }

    // Método para fechar conta
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro. Não é possível fechar!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito. Não é possível fechar!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    // Método para depositar dinheiro
    public void depositar(float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    // Método para sacar dinheiro
    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    // Método para pagar mensalidade
    public void pagarMensal() {
        int valor = 0;
        if (this.getTipo().equals("cc")) {
            valor = 12;
        } else if (this.getTipo().equals("cp")) {
            valor = 20;
        }
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para pagar mensalidade!");
            }
        } else {
            System.out.println("Impossível pagar mensalidade em uma conta fechada!");
        }
    }
}