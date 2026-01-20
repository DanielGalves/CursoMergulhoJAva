package com.dgama.banco.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas = new ArrayList<>();

    public Banco() throws IllegalAccessException {
        Pessoa pessoa1 = new Pessoa("Alfredo limão","121212121212");
        Pessoa pessoa2 = new Pessoa("Joaquina Bezerra","343434343434");

        Conta conta1 = new ContaInvestimento(pessoa1,222,999);
        Conta conta2 = new ContaInvestimento(pessoa1,123,888);
        Conta conta3 = new ContaInvestimento(pessoa2,123,567);
        Conta conta4 = new ContaEspecial(pessoa1,123,188,new BigDecimal("30"));
        Conta conta5 = new ContaEspecial(pessoa2,222,999,new BigDecimal("50"));

        conta1.depositar(new BigDecimal("120"));
        conta2.depositar(new BigDecimal("150"));
        conta3.depositar(new BigDecimal("500"));
        conta5.depositar(new BigDecimal("12000"));

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);

    }

    public List<Conta> getContas(){ return contas;}
}
