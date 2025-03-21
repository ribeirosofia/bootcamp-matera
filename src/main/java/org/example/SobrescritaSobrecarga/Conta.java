package org.example.SobrescritaSobrecarga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter

public class Conta {
    protected Double saldo;
    protected Double taxaOperacao;

    public Conta(Double saldo) {
        this.saldo = saldo;
        this.taxaOperacao = 0.45;
    }

    public void depositar(Double valor) {
        this.saldo += valor - taxaOperacao;
    }
}
