package main.java.org.example.interfaces;

public class TesteInterface {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(5000.00);
        System.out.println("Conta Corrente após depósito: " + contaCorrente.getSaldo());
        contaCorrente.sacar(1000.00);
        System.out.println("Conta Corrente após saque: " + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(15000.00);
        System.out.println("Conta Poupança após depósito: " +contaPoupanca.getSaldo());
        contaPoupanca.sacar(800.00);
        System.out.println("Conta Poupança após saque: " +contaPoupanca.getSaldo());
    }
}
