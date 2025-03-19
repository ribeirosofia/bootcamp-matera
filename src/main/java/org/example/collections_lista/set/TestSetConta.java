package org.example.collections_lista.set;

import java.util.HashSet;
import java.util.Set;

public class TestSetConta {
    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<>();
        contas.add(new Conta(100L, 300.00));
        contas.add(new Conta(100L, 150.00));

        contas.forEach(conta -> System.out.println(conta));
    }
}
