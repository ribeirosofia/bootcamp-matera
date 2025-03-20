package org.example.optional;

import org.example.collections_lista.set.Conta;
import java.util.Optional;

public class TesteOpcional {
    public static void main(String[] args) {
        Optional<Conta> optionalConta = obtemContaSemErro();

       if(optionalConta.isPresent()){
           System.out.println("Saldo: " + optionalConta.get().getSaldo());
       }else{
           System.out.println("Não foi localizado a conta.");
       }
    }

    private static Optional<Conta> obtemContaSemErro() {
        return Optional.of(null);
    }

    public static Conta obtemConta(){
        return null;
    }

}
