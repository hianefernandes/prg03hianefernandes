
import com.br.ifba.br.com.ifba.prg03.atividade08.ContaBanco;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hiane
 */
public class Main {
   
    public static void main(String[] args) {
        // Criando uma instância de ContaBanco para teste
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(1111);
        conta1.setDono("Jubileu");

        // Abrindo uma conta corrente
        conta1.abrirConta("cc");
        System.out.println("Saldo após abertura da conta corrente: " + conta1.getSaldo());

        // Realizando um depósito
        conta1.depositar(100);
        System.out.println("Saldo após depósito: " + conta1.getSaldo());

        // Realizando um saque
        conta1.sacar(50);
        System.out.println("Saldo após saque: " + conta1.getSaldo());

        // Pagando a mensalidade
        conta1.pagarMensal();
        System.out.println("Saldo após pagamento de mensalidade: " + conta1.getSaldo());

        // Tentando fechar a conta
        conta1.fecharConta();
        
        // Criando outra conta de poupança
        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(2222);
        conta2.setDono("Creusa");

        // Abrindo uma conta poupança
        conta2.abrirConta("cp");
        System.out.println("Saldo após abertura da conta poupança: " + conta2.getSaldo());

        // Fechando a conta poupança após retirar o saldo
        conta2.sacar(150);
        conta2.fecharConta();
    }
}