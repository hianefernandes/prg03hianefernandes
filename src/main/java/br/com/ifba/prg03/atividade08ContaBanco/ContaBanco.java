/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

public class ContaBanco {
    
    //atribuutos
    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos personalizados
    public void estadoAtual(){
        System.out.println("-------------------------");
        System.out.println("CONTA: " + this.getNumeroConta());
        System.out.println("TIPO: " + this.getTipo());
        System.out.println("DONO: " + this.getDono());
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("STATUS: " + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta com sucesso!");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta nao pode ser fechada porque ainda tem saldo");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta nao pode ser fechada porque possui debitos");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("ERRO no deposito!");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado com sucesso");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Conta invalida");
        }
    }
    public void pagarMensalidade(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP") {
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        }else{
            System.out.println("Nao foi possivel realizaar pagar mensalidade");
        }
    }
    
    //metodos especiais
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
        
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
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
    
    
}
