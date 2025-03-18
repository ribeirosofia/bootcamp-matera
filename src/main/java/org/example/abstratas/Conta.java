package main.java.org.example.abstratas;

public abstract class Conta {
    private Double saldo;

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public abstract void ImprimeExtrato();

    public abstract void imprimeExtrato();
}
