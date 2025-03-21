package org.example.TratamentoExecoes;

public class ExcecaoParaValorSaqueZerado extends Exception{

    public String getMessage(){
        return "Valor para saque não pode ser Zero";
    }
}
