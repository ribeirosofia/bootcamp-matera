package org.example.collections_lista.stream;

import org.example.collections_lista.lista.TesteLista;

import java.util.ArrayList;
import java.util.List;

public class TesteListaStream {
    public static void main(String[] args) {
        List<String> contas = new ArrayList();

        contas.add("Conta Poupança");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupança");

        contas.stream()
                .filter(conta -> filterLista(conta))
                .forEach(conta -> System.out.println("Conta: " + conta));

        long total = contas.stream()
                .filter(conta -> filterLista(conta))
                .count();
        System.out.println("Total Poupança: " + total);

        long totalContas = 0;
        for(int index = 0; index < contas.size(); index++){
            String conta = contas.get(index);
            if(conta.contains("Poupança")){
                totalContas++;
            }
        }

        System.out.println("Total Poupança: " + totalContas);

    }

    public static Boolean filterLista(String conta){
        return conta.contains("Poupança");
    }

}
