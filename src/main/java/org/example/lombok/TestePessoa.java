package org.example.lombok;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoaX = new Pessoa();

        pessoaX.setId(1L);
        pessoaX.setNome("Miguel");
        pessoaX.setIdade(25);

        System.out.println(pessoaX);
    }
}
